package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.User;

@FeignClient(name = "user-producer", url="http://localhost:8072")
public interface UserFeign {
	@GetMapping("/User")
	public List<User> getAllUser();
	
}
