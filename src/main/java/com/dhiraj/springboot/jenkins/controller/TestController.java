package com.dhiraj.springboot.jenkins.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("/welcome")
	public String welcomeMsg() {
		LocalDate str=LocalDate.now();
		return "Welcome to the Spring Boot Jenkins deploy example" +"\n"+"server date and time" +str;
	}
	

}
