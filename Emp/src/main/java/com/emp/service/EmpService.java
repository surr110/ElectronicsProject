package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.emp.dao.EmpDao;
import com.emp.entity.Emp;

@Service
public class EmpService {

	@Autowired
	EmpDao ed;

	public String setEmp(Emp e) {

		return ed.setEmp(e);
	}

	public List<Emp> getEmp() {
		return ed.getEmp();
	}
	
	//getby id

	public Emp getByEmpId(@PathVariable int a) {
		return ed.getEmpId(a);
	}

	// deleting//
	
	public String delByEmpId(@PathVariable int a) {
		// TODO Auto-generated method stub
		return ed.delByEmpId(a);
	}

	// updating//
	public String upempid(int a, Emp e) {
		return ed.upempid(a, e);
	}
	
//this also update method directly in services instead of adding in EmpDao//
	
public String updateEmp(int b,Emp e) {
	
		Emp x= getByEmpId(b);
		
		//we get this (getByEmpId) method directly from EmpDao findById 
		
		x.setName(e.getName());
		x.setAge(e.getAge());
		x.setGender(e.getGender());
		return ed.updateEmp(e);
				
}
	
}
