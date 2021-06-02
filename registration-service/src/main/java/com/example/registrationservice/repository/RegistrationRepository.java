package com.example.registrationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registrationservice.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration,Integer> {

	Registration findByEmailId(String email);
	Registration findUserByEmailIdAndPassword(String email, String pass);

}
