package com.ProductAPI2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductAPIController {
	
	@GetMapping("/getvalue")
	public String getting() {
		return "Sony";
	}

}
