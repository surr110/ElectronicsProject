package com.APIgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApIgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApIgatewayApplication.class, args);
	}

}
