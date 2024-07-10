package com.MobileAPI1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MobileAPIControlller {
    @Autowired
    RestTemplate rt;
	
	@GetMapping(value="/get")
	public String getAPI() {
		String url="http://localhost:8081/getvalue";
		String value=rt.getForObject(url, String.class);
		return value;
	}
	

}
