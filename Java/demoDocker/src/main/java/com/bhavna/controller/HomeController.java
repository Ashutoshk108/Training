package com.bhavna.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
	
	@GetMapping
	public String display() {
		return "Welcome to your own web-site";
	}

}
