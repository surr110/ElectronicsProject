package com.emp.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.emp.entity.Emp;
import com.emp.repo.EmpRepo;

@Repository
public class EmpDao {

	@Autowired
	EmpRepo er;

	public String setEmp(Emp e) {
		er.save(e);
		return "Saved successfully";
	}

	// find all//

	public List<Emp> getEmp() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

/// to find data by Id

	public Emp getEmpId(@PathVariable int a) {
		return er.findById(a).get();
	}

	// delete

	public String delByEmpId(@PathVariable int a) {

		er.deleteById(a);

		return "Deleted Sucessfully";
	}

	// updating the id//

	public String upempid(@PathVariable int a, Emp e) {

		Emp val = er.findById(a).get();

		val.setName(e.getName());
		val.setAge(e.getAge());
		val.setGender(e.getGender());
		er.save(val);

		return "Updated Succesfully";

	}

//////--------------------------------------------------------------------------/////

	public String updateEmp(Emp e) {
		er.save(e);
		return "<----------Update  value SuccesFully-------------->";
	}
	
	
}
