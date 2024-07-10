package com.Customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Customer.entity.Customer;
import com.Customer.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	RestTemplate rt;
	@Autowired
	CustomerService cs;
	
	@PostMapping(value = "/postdata")
	public String setdatas(@RequestBody Customer a){

		String url= "http://localhost:8081/bank/getbranchdetail/";
		String b=a.getIfsccode();
		ResponseEntity<String> custom = rt.exchange(url+b, HttpMethod.GET, null, String.class);
		
		 String result=custom.getBody();
		 a.setBranch(result);
		 

	
		return cs.setdatas(a);
		
	}
	

}
