package com.manipal.cart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue
	private int  productid;
	private String productname;
	private int qty;
	private int price;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int productid, String productname, int qty, int price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.qty = qty;
		this.price = price;
	}
	
	
	
	
	

	
	

}
