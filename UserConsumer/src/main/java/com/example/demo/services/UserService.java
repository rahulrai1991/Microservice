package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser()
	{
		List<User> user= userRepository.findAll();
		return user;
	}
	
	public User saveUser(User user)
	{
		return userRepository.save(user);
	}

}
