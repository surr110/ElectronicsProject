package com.example.CodeWrite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class UseEmployee implements CommandLineRunner {
	@Autowired
	ApplicationContext ac;

	public void run(String...args) {
		Employee e1 = ac.getBean(Employee.class);
		// e1.setName("Vijay");
		System.out.println(e1);

		Employee e2 = ac.getBean(Employee.class);
		// e2.setName("Ajith");
		System.out.println(e2);

		Employee e3 = ac.getBean(Employee.class);
		// e3.setName("Sachin");
		System.out.println(e3);

//		System.out.println(e1.getName());
//		System.out.println(e2.getName());
//		System.out.println(e3.getName());

	}

	@Bean
	@Scope("prototype")
	
	public Employee get() {
		return new Employee();
	}

}
