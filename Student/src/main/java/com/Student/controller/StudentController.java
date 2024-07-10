package com.Student.controller;

import java.util.List;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Student.customException.AgeNotMatchException;
import com.Student.customException.IdNotFoundException;
import com.Student.entity.Student;
import com.Student.service.StudentService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
	@Autowired
	StudentService ss;

	@PostMapping(value = "/set")
	public String getstudentdetail(@RequestBody Student s) throws AgeNotMatchException
{
		return ss.getstudentdetail(s);
	}
	
	@PostMapping(value="/PostAll")
	public String setAll(@RequestBody List<Student> s) throws AgeNotMatchException {
		return ss.setAll(s);
	}
	
	@PostMapping(value="/DataPosted")
	public String postData(@RequestBody  List<Student> s) {
	return ss.postData(s);
}
	
	@GetMapping(value="/getAll")
	public List<Student>getAlldetail(){
		return ss.getAlldetail();
	}
	@GetMapping(value = "/studentnamematch/{a}")
	public List<Student> getSname(@PathVariable String a) throws NameNotFoundException{
		return ss.getSname(a);
	}
	
	@GetMapping(value="/getById/{a}")
	public List<Student> getbyid(@PathVariable int a) throws IdNotFoundException{
		return ss.getbyid(a);
	}
	
	@GetMapping(value="/getSidId/{a}")
	public Student getsid(@PathVariable int a) throws IdNotFoundException{
		return ss.getsid(a);
	}
	
	
}