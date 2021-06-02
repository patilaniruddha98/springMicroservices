package com.manipal.restdemo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manipal.restdemo.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
