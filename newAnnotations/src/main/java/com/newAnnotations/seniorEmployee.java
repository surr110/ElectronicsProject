package com.newAnnotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("SeniorEmp")
@Primary
public class seniorEmployee implements Employee {

	@Override
	public String getMessage() {
		
		return "CEO";
	}

}
