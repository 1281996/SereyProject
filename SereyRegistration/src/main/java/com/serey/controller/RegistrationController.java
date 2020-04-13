package com.serey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serey.model.UserRegistration;
import com.serey.pojo.UserLogin;
import com.serey.service.RegistrationService;


//@CrossOrigin(origins="http://localhost:4001")
@RestController
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;
	///777777777777777777777777777
	@PostMapping("/serey/users/create")
	public UserRegistration createUser(@RequestBody UserRegistration account) {
		registrationService.createUser(account);
		return account;
	}
	
	@PostMapping("/serey/users/validate")
	public boolean createUser(@RequestBody UserLogin loginUser) {
		return registrationService.validateUser(loginUser);
		//return loginUser;
	}
	
	}
	
	

