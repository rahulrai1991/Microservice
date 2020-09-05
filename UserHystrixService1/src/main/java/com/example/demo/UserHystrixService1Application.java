package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class UserHystrixService1Application {

	public static void main(String[] args) {
		SpringApplication.run(UserHystrixService1Application.class, args);
	}

}
