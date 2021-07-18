package com.nomadadigital.apirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
	
	@GetMapping("/test")
	public String test() {
		return "Test";
	}

}
