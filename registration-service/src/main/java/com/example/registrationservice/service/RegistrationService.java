package com.example.registrationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registrationservice.model.Registration;
import com.example.registrationservice.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	public Registration saveUser(Registration user) {
		return registrationRepository.save(user);
		
	}
	public Registration fetchUserByEmialId(String email) {
		
		return registrationRepository.findByEmailId(email);
		// TODO Auto-generated method stub
		
	}
	public Registration fetchUserByEmailIdAndPassword(String email, String pass) {
		// TODO Auto-generated method stub
		return registrationRepository.findUserByEmailIdAndPassword(email, pass);
	}
	

}
