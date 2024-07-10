package com.Customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Customer.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
