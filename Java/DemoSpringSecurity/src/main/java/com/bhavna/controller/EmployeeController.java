package com.bhavna.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping
	public String display() {
		return "In spring security examples";
	}

}
