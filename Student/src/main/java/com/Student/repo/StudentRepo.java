package com.Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {



}
