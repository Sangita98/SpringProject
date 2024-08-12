package com.sangita.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/getData/{id}")
	public String getData(@PathVariable int id) {
		System.out.println("Given id is : " +id);
		
		if(id == 10)
			return "charan";
		else if(id==11)
			return "Ravi";
		else if (id == 12)
			return "Geeethika";
		else if (id == 13)
			return "sai";
		else
			return "Invalid Employee id : ";
	}

}
