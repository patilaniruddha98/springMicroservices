 package com.example.registrationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registrationservice.model.Registration;
import com.example.registrationservice.service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	private RegistrationService service;
	@PostMapping("/registeruser")
	@CrossOrigin(origins="http://localhost:4200")
	public Registration registerUser(@RequestBody Registration user) throws Exception {
        
		String tempEmailId=user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId)) {
			Registration userObj=service.fetchUserByEmialId(tempEmailId);
			if(userObj != null) {
				throw new Exception("user with "+tempEmailId+" is already exist");
			}
		}

		Registration userObj=null;
		userObj=service.saveUser(user);
		return userObj;
		
	}
	
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public Registration loginUser(@RequestBody Registration user) throws Exception {
		String tempEmailId=user.getEmailId();
		String tempPass=user.getPassword();
		Registration userObj=null;
		if(tempEmailId != null && tempPass != null ) {
			userObj=service.fetchUserByEmailIdAndPassword(tempEmailId,tempPass);
		}
		if(userObj==null) {
			throw new Exception("bad credentials");
		}
		return userObj;
	}

}
