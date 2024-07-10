package com.StudentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDetails.CustomException.InvalidAgeException;
import com.StudentDetails.entity.Student;
import com.StudentDetails.service.StudentService;

@RequestMapping("Std")
@RestController

public class StudentController {
	@Autowired
	StudentService ss;
	
	@PostMapping(value="/postdata")
	public String setData(@RequestBody Student s) throws InvalidAgeException {
	  return ss.setData(s);
	}
	
	@PostMapping(value="/postAlldatas")
	public String setAllData(@RequestBody List<Student>s) {
		return ss.setAllData(s);
	}
	
	@GetMapping(value="/getdatas")
	public List<Student> getData() {
		return ss.getData();
	}
	
	
	@GetMapping(value="/getDataById")
	public Student getDataByid(@PathVariable int a) {
		return ss.getDataByid(a);
	}
	
	@PutMapping(value="/UpdateData/{a}")
	public String updatingData(@PathVariable int a,@RequestBody Student s) {
		return ss.updatingData(a,s);
	}
	
	@GetMapping(value="/RollNumber/{a}")
	public Student getByRollNumber(@PathVariable int a){
		return ss.getByRollNumber(a);
	}

}
