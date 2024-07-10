package com.example.EmployeesDetail1.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.EmployeesDetail1.emprepository.Emprepository;
import com.example.EmployeesDetail1.entity.Employees;


@Repository
public class EmployeesDao { 
	@Autowired
	Emprepository er;
	

	public String postEmp(Employees e) {
		er.save(e);
		return "Posted Successfully";

	}

}




