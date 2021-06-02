package com.manipal.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manipal.cart.model.Cart;
import com.manipal.cart.service.CartService;



public class CartController {
	
	@Autowired
	CartService cartService;
	
	@RequestMapping(value="/cart",method=RequestMethod.GET)
	@CrossOrigin(origins="http://localhost:4200")
	public List<Cart> getCarts(){
		return cartService.getCart();
	}
	
	
	
	
	@RequestMapping(value="/cart",method=RequestMethod.POST)
	@CrossOrigin(origins="http://localhost:4200")
	public String addProducttoCart(@RequestBody Cart cart ){
		cartService.addProduct(cart);
		return "success";
		
	}

}
