package com.StudentDetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentDetails.entity.Student;
import com.StudentDetails.repo.StudentRepo;

@Repository

public class StudentDao {
	@Autowired
	StudentRepo sr;

	public String setData(Student s) {
		sr.save(s);

		return "<------------DATA SAVED SUCCESSFULLY--------------->";
	}

	public String setAllData(List<Student> s) {
		sr.saveAll(s);
		
		return "<====All Datas Successfully Saved=============>";
	}

	public List<Student> getData() {
		
		
		return sr.findAll();
	}
	
	
	public Student getDataByid(int a) {
		return sr.findById(a).get();
	}

	public String updatingData(Student s) {
		sr.save(s);
		return "Data Updated Sucessfully";
	}

	public Student getByRN(int a) {
	
		return sr.getByRN(a);
	}

	

}
