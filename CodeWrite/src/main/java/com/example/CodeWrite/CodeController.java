package com.example.CodeWrite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/idea")
@RestController

public class CodeController {

	@GetMapping(value = "/getname")
	public String display() {
		return "Tamil Nadu";
	}


}
