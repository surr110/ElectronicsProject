package com.StudentDetails.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentDetails.CustomException.InvalidAgeException;
import com.StudentDetails.dao.StudentDao;
import com.StudentDetails.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;

	public String setData(Student s) throws InvalidAgeException {
		
		if (s.getAge() > 18) {
			
			return sd.setData(s);
		} 
		else 
		{
			throw new InvalidAgeException("Age is Below 18");
		}

	}

	public String setAllData(List<Student> s) {

		return sd.setAllData(s);
	}

	public List<Student> getData() {

		return sd.getData();
	}

	public Student getDataByid(int a) {

		return sd.getDataByid(a);
	}

	public String updatingData(int a, Student s) {
		Student std = getDataByid(a);
		std.setName(s.getName());
		std.setGender(s.getGender());
		std.setAge(s.getAge());
		std.setCourse(s.getCourse());

		return sd.updatingData(s);
	}

	public Student getByRollNumber(int a) {
		
		return sd.getByRN(a);
	}
	
	
	}


