package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

@RestController
public class UserController {

	@Autowired RestOperations restOperations;
	
	@GetMapping("/user")
	public String user() {
		return restOperations.getForObject("http://127.0.0.1:8763/user/info", String.class);
	}
}
