package com.dhiraj.springboot.jenkins.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("index") ;
	}
	@GetMapping("/welcome")
	public String welcomeMsg() {
		LocalDate str=LocalDate.now();
		return "Welcome to the Spring Boot Jenkins deploy example" +"\n"+"server date and time" +str;
	}
	

}
