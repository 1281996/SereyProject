package com.serey.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serey.model.UserRegistration;


public interface UserRepository extends MongoRepository<UserRegistration, String>{

	

}
