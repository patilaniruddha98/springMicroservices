package com.manipal.restdemo.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.restdemo.demo.model.Customer;
import com.manipal.restdemo.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	List<Customer> customerList=new ArrayList<Customer>();
	
	
	public CustomerService() {
		/*
		 * productList.add(new Product(1001,"samsung",20)); productList.add(new
		 * Product(1002,"nokia",10));
		 */
	}
	
	
	public List<Customer> getCustomer(){
		return customerRepository.findAll();
	}
	
	
	public void addCustomer(Customer customer) {
		
		customerRepository.save(customer);
	}

	
	public List<Customer> deleteCustomer(int id){
		Iterator<Customer> ie=customerList.iterator();
		while(ie.hasNext()) {
			if(ie.next().getCustomerId()==id) {
				ie.remove();
			}
		}
		return customerList;
	}
	
	public Customer getCustomerById(int id){
		Customer c=null;
		Optional<Customer> customer= customerRepository.findById(id);
		if(customer.isPresent()) {
			c=customer.get();
		}
		return c;
	}

}
