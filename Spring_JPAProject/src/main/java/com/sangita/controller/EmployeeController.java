package com.sangita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangita.data.Employee1;
import com.sangita.repository.IEmpRepository;

@RestController
public class EmployeeController {

	@Autowired
	IEmpRepository empRepo;
	
	@GetMapping("/getAllRecords")
	public List<Employee1> getAllRecords(){
		
		//SELECT * FROM EMPLOYEE
		List<Employee1> empList = empRepo.findAll();		
		
		return empList;
	}
	
	//post mapping
	
	@PostMapping("/insertData")
	public String insertedData(@RequestBody Employee1 empObj) {
		System.out.println("Recieveed data is : "+empObj);
		empRepo.save(empObj);
		
		return "Given recorde is inserted in the database successfully";
	}
	
	//Update Mapping
	
	@PutMapping("/updateData")
	public String updateData(@RequestBody Employee1 emp) {
		System.out.println("Given Data to ipdate is : " +emp);
		empRepo.save(emp);
		
		return "Given record is updated in the db successfully..";
	}
	
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable int id) {
		
		System.out.println("Given ID is delete is: " +id);
		empRepo.deleteById(id);
		return "Given record with ID : " + id + " is deleted";
	}
}
