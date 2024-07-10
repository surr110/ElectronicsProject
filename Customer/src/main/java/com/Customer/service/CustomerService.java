package com.Customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Customer.dao.CustomerDao;
import com.Customer.entity.Customer;
@Service

public class CustomerService {
	@Autowired
	CustomerDao cd;

	public String setdatas(Customer a) {
		
		return cd.setdatas(a);
	}

}
