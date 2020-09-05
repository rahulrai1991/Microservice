package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/User")
	public ResponseEntity<List<User>> getALLUser()
	{
		List<User> usert=userService.getAllUser();
		return new ResponseEntity<List<User>>(usert, HttpStatus.OK);
	}
}
