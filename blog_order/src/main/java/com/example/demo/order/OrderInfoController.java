package com.example.demo.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderInfoController {

	@GetMapping("/order")
	public String getOrder() {
		return "Get Order Info";
	}
}
