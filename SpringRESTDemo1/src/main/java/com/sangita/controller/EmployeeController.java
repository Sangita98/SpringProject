package com.sangita.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sangita.data.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello, Welcome to Spring REST...";
	}
	
	
	@GetMapping("/login")
	public ResponseEntity<Object> login(@RequestParam String UID, @RequestParam String PWD) throws Exception {
		System.out.println("Given Data is : User ID : " + UID + "Password : " +PWD);
		if(!UID.equalsIgnoreCase("Sangita"))
			throw new UserNotFoundException ("Given ID must be Charan only...");
		
		if(UID.equalsIgnoreCase("Sangita") && PWD.equalsIgnoreCase("admin"))
			return new ResponseEntity<>("Your are a valid user",HttpStatus.OK);
		else
			 return new ResponseEntity<>("YInvalid user",HttpStatus.NOT_FOUND);
					
	}
	
	@PostMapping("/insertData")
	public String insertedData(@RequestBody Employee empobj) {
		System.out.println("Reived data is : "+empobj);
		return "Given record is inserted in the database successfully";
}
	@PutMapping("/updateData")
	public String updateData(@RequestBody Employee emp) {
		System.out.println("Given  Data to update is: "+emp);
		
		return "Given record is updated in the db Successfully...";
	}
	
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable int id) {
		System.out.println("Given ID to delete is : +id");
		return "Given record with Id : "+ id + "is deleted successfully";
	}
	
	@ControllerAdvice
	public class GlobalExceeptionHandler{
		@ExceptionHandler (UserNotFoundException.class)
				public ResponseEntity<Object> handleUserNotFoundException (UserNotFoundException ex){
			return new ResponseEntity<> ("User must be Sangita only...", HttpStatus.NOT_FOUND);
		}
	}
}
