package com.StudentDetails.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.StudentDetails.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Query(value = "select * from studentsfulldetails.sdetail where roll_number like ?", nativeQuery = true)
	Student getByRN(int a);

}
