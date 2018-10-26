package com.example.demo.user.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user/info")
	public Principal getUser(Principal principal) {
		return principal;
	}
}
