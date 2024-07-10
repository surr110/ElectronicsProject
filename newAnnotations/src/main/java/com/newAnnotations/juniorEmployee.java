package com.newAnnotations;

import org.springframework.stereotype.Component;

@Component("JuniorEmp")
public class juniorEmployee implements Employee {

	@Override
	public String getMessage() {
		
		return "Manager";
	}

}
