package com.example.EmployeesDetail1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeesDetail1.entity.Employees;
import com.example.EmployeesDetail1.repository.EmployeesDao;

@Service
public class Empservice {

	@Autowired
	EmployeesDao ep;

	public String postEmp(Employees e) {
		return ep.postEmp(e);
	}

}
