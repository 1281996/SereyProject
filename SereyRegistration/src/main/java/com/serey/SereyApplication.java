package com.serey;

import javax.validation.constraints.Digits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SereyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SereyApplication.class, args);
	}

}
