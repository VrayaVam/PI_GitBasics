package com.nomadadigital.apirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GitController {
	
	@GetMapping("/test")
	public String test() {
		return "Test";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello everyone";
	}
	
	@PostMapping("/save")
	public String save(@RequestBody String value) {
		return value;
	}

}
