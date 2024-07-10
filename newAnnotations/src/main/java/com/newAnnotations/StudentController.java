package com.newAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	@Value("Surendar")
	String name;
	
	@GetMapping("/gets")
	public String getName() {
		return name;
	}
	
	
	
	@Value("${myname}")
    String names;
	
	@GetMapping("/getting")
	public String getNames() {
		return names;
	}

}
