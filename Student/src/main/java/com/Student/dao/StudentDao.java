package com.Student.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.Student.entity.Student;
import com.Student.repo.StudentRepo;

@Repository
public class StudentDao {
	@Autowired
	StudentRepo sr;

	public String studentdetail(Student s) {
		sr.save(s);

		return "<---------------Saved Successfully--------------->";
	}

	public String setAll(ArrayList<Student> std) {
	     sr.saveAll(std);
		return "<------------------Saved Successfully--------------->" ;
	}
	
	public String postData(List<Student> s) {
		sr.saveAll(s);
		return "Data Saved";
	}

	public List<Student> getAlldetail() {
		
		return sr.findAll();
	}
	public Student getid(@PathVariable int a) {
		return sr.findById(a).get();
	}

}
