package com.sangita.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Employee1")
public class Employee1 {
	
	@Id
	int id;
	String name;
	String dept;
	String designation;
	
	Employee1(){}

	public Employee1(int id, String name, String dept, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", designation=" + designation + "]";
	}

	
}
