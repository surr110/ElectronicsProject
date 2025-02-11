package com.Student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Student.customException.AgeNotMatchException;
import com.Student.customException.IdNotFoundException;
import com.Student.dao.StudentDao;
import com.Student.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;

	public String getstudentdetail(Student s) throws AgeNotMatchException {
		// try {
		if (s.getAge() > 18) {

			return sd.studentdetail(s);
		} else {

			throw new AgeNotMatchException("Age is Below 18");
		}
		// }

//		catch (AgeNotMatchException e) {
//			// e.getMessage();//
//			return "Not Allowed";
//		}

	}

	public String setAll(List<Student> s) throws AgeNotMatchException {
		ArrayList<Student> std = new ArrayList<>();
		for (Student e : s) {
			if (e.getAge() > 18) {
				std.add(e);
			} else {
				throw new AgeNotMatchException("Not allowed");
			}
		}
		return sd.setAll(std);
	}

	public String postData(List<Student> s) {

		return sd.postData(s);
	}

	public List<Student> getAlldetail() {

		return sd.getAlldetail();
	}

	public List<Student> getSname(String a) throws NameNotFoundException {

		List<Student> na = getAlldetail();

		List<Student> names = na.stream().filter(X -> X.getName().equals(a)).toList();
		if (names.isEmpty()) {
			throw new NameNotFoundException("Name Not matched");
		} else {
			return names;
		}
	}

	//// predefined----> NoSuchElementException===instead of
	//// IdNotFoundException--->/////
	public List<Student> getbyid(int a) throws IdNotFoundException {
		List<Student> ss = getAlldetail();
		
		List<Student> id = ss.stream().filter(X -> X.getId() == a).toList();

		if (id.isEmpty()) {
			throw new IdNotFoundException("Your Id Is Not Found");
		} else {
			return id;
		}

	} 
	
		public Student getsid(int a) throws IdNotFoundException {
			List<Student>ss=getAlldetail();
		
		return ss.stream().filter(x->x.getId()==a).findFirst().orElseThrow(()->new IdNotFoundException("No Such Id Found: "+a));
		
}
}
