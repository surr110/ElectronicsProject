package com.example.CodeWrite;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

public class Employee {
	private String name;

	public Employee() {
		System.out.println("Employee object Created");
	}

	public String getName() {
		return name;
	}
@Value("scope of bean")
	public void setName(String name) {
		this.name = name;
	}

@Override
public String toString() {
	return "Employee [name=" + name + "]";
}

}
