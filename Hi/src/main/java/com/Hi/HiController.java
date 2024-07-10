package com.Hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HiController {
	@GetMapping(value="/getHi")
	public String getThis() {
		return "Hi";
	}

}
