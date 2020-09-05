package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.UserClient;
import com.example.demo.entity.User;
import com.example.demo.feign.UserFeign;
import com.example.demo.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserClient userClient;
	@Autowired
	private UserFeign userFeign;
	
	@GetMapping("/user1")
	public ResponseEntity<List<User>> getALLUser()
	{
		//List<User> usert=userService.getAllUser();
		List<User> user=userClient.getAllUserData();
		return new ResponseEntity<List<User>>(user, HttpStatus.OK);
	}
	//This method is used for calling microiservices n
	@GetMapping("/userDetails")
	public ResponseEntity<List<User>> getAllUser1()
	{
		List<User> user=(List<User>) userFeign.getAllUser();
		return new ResponseEntity<List<User>>(user, HttpStatus.OK);
	}
}
