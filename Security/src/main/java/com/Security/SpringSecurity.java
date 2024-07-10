package com.Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurity {

	@GetMapping(value = "/getname")
	public String display() {
		return "Tamil Nadu";
	}

	@GetMapping(value = "getString")
	public String get() {
		return "Im from Spring Sequrity";
	}

	@GetMapping(value = "/getmanager")
	public String get1() {
		return "Im from Manager Access";
	}

	@GetMapping(value = "/getstudent")
	public String get2() {
		return "Im from Student Access";
	}

	@GetMapping(value = "/gettrainer")
	public String get3() {
		return "Im from Trainer Access";
	}

}
