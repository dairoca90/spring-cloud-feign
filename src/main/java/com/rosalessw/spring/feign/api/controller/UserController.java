package com.rosalessw.spring.feign.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosalessw.spring.feign.api.client.UserClient;
import com.rosalessw.spring.feign.api.dto.UserResponse;

@RestController
public class UserController {

	
	private UserClient userClient;
	
	@Autowired
	public UserController(UserClient userClient) {
		this.userClient = userClient;
	}



	@RequestMapping("users")
	public List<UserResponse> getUsers(){
		return userClient.findUsers();
	}
	
	
}
