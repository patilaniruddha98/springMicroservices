package com.manipal.cart.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.manipal.cart.model.Cart;
import com.manipal.cart.repository.CartRepository;



public class CartService {
	@Autowired
	CartRepository cartRepository;
	
	List<Cart> productList=new ArrayList<Cart>();
	
	public List<Cart> getCart(){
		return cartRepository.findAll();
	}

	public void addProduct(Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.save(cart);
		
	}

	

}
