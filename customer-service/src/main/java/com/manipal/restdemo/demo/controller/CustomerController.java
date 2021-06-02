package com.manipal.restdemo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.restdemo.demo.model.Customer;
import com.manipal.restdemo.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/customers",method=RequestMethod.GET)
	public List<Customer> getCustomer(){
		System.out.println("port 8170");
		return customerService.getCustomer();
	}
	
	@RequestMapping(value="/customers",method=RequestMethod.POST)
	public String addCustomer(@RequestBody Customer customer ){
		customerService.addCustomer(customer);
		return "success";
		
	}
	
	@RequestMapping(value="/customers/{id}", method=RequestMethod.DELETE)
	public List<Customer> deleteCustomer(@PathVariable int id){
		return customerService.deleteCustomer(id);
	}
	
	@RequestMapping(value="/customers/{id}", method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable int id){
		return customerService.getCustomerById(id);
	}

}
