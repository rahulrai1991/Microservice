package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class UserHystrixController {
	
	@GetMapping("/getAllUser")
	@HystrixCommand(fallbackMethod = "getDummmyHystrixCommand")
	public String getHystricMethod()
	{
		throw new RuntimeException("User Not Found"); 
	}
	
	public String getDummmyHystrixCommand()
	{
		return "welcome";
	}

}
