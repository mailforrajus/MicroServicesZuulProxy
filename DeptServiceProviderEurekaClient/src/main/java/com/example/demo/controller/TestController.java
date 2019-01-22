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

import com.example.demo.entity.DepartmentEntity;

@RestController
@RequestMapping(value="/dept")
public class TestController {
	

	@GetMapping(value = "/getAllDeptDetails", produces = MediaType.APPLICATION_JSON)
	public List<DepartmentEntity> displayAll() {
		System.out.println("TestController.displayAll()");
		List<DepartmentEntity> employeeList = new ArrayList<DepartmentEntity>();
		employeeList.add(new DepartmentEntity(101, "Software"));
		employeeList.add(new DepartmentEntity(102, "Hardware"));
		employeeList.add(new DepartmentEntity(103, "Admin"));

		return employeeList;

	}

	
}
