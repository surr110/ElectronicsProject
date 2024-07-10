package com.newAnnotations;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ParamProgram {
	
	@GetMapping("user")
	public String getName(@RequestParam String  name) {
		return "Hello"+name;
	}
	

}
