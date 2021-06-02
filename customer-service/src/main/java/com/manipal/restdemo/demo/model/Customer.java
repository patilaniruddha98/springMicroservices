package com.manipal.restdemo.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	
	private int customerId;
	private String customerName;
	private String CustomerAddress;
	@Id
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public Customer() {
		super();
		
	}
	public Customer(int customerId, String customerName, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		CustomerAddress = customerAddress;
	}
	
	
	

}
