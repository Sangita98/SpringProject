package com.sangita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/hello") 
	public String hello() {
		return "welcome";
	}
	



}
