package com.example.demo.client;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.User;

@Component
public class UserClient {
	
	
	//private RestTemplate restTemplate;
	private static String REST_URL="http://localhost:8072/User";
	@Bean
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}
	
	public List<User> getAllUserData()
	{
		RestTemplate restTemplate=new RestTemplate();
		//List<User> lstUser=(List<User>) restTemplate.getForObject(REST_URL, User.class);
		
		ResponseEntity<List<User>> response=restTemplate.exchange(REST_URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>(){});
		List<User> users=response.getBody();
		System.out.println(users);
		return users;
	}
	
}
