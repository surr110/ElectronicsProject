package com.example.EmployeeDetail1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeesDetail1.entity.Employees;
import com.example.EmployeesDetail1.service.Empservice;



@RestController
public class EmployeesController {

	@Autowired
	Empservice es;

	@PostMapping(value = "/PostOneObj")
	public String postEmp(@RequestBody Employees e) {
		return es.postEmp(e);

	}
}


