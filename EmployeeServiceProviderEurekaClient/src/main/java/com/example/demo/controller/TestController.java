package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;

@RestController
@RequestMapping(value="/employee")
public class TestController {
	

	@GetMapping(value = "/getAllEmpDetails", produces = MediaType.APPLICATION_JSON)
	public List<EmployeeEntity> displayAll() {
		System.out.println("TestController.displayAll()");
		List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();
		employeeList.add(new EmployeeEntity(101, "Rajgovind"));
		employeeList.add(new EmployeeEntity(102, "Ramasai"));
		employeeList.add(new EmployeeEntity(103, "Madhu"));

		return employeeList;

	}

	
}
