package com.newAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Qualifier("JuniorEmp")
	@Autowired
	Employee e;
	
	@GetMapping("/get")
	public String getMessage() {
		return e.getMessage();
	}
	

}
