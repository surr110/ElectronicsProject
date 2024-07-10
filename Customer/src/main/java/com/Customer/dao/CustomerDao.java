package com.Customer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Customer.entity.Customer;
import com.Customer.repo.CustomerRepo;
@Repository

public class CustomerDao {
	@Autowired
	CustomerRepo cr;

	public String setdatas(Customer a) {
		 cr.save(a);
		return "Data Stored";
	}

}
