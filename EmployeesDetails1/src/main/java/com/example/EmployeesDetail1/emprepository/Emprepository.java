package com.example.EmployeesDetail1.emprepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeesDetail1.entity.Employees;

public interface Emprepository extends JpaRepository<Employees, Integer> {

}
