package com.MobileAPI1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MobileApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(MobileApi1Application.class, args);
	}
	@Bean

	public RestTemplate rest() {
		return new RestTemplate();
	}
}
	
