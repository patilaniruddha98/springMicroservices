package com.manipal.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manipal.cart.model.Cart;



public interface CartRepository  extends JpaRepository<Cart, Integer> {

}
