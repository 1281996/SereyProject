package com.serey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.serey.model.UserRegistration;
import com.serey.pojo.UserLogin;
import com.serey.repository.UserRepository;

@Component
public class RegistrationService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String createUser(UserRegistration account) {
		// TODO Auto-generated method stub
		System.out.println(account);
		System.out.println("Saving user...");
		userRepository.save(account);
		return "added succesfully";
	}

	public boolean validateUser(UserLogin loginUser) {
		// TODO Auto-generated method stub
		List<UserRegistration> dbusers=  userRepository.findAll();
		for(UserRegistration user:dbusers) {
			if(user.getEmail().equals(loginUser.getEmail()) && user.getPassword().equals(loginUser.getPassword())) {
				return true;
			}
			
		}
		return false;
		
	}

}
