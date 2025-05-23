package com.dhiraj.springboot.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to the Spring Boot Jenkins deploy example";
	}
	

}
