package com.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
