package com.example.webapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@RequestMapping(value = "/admin")
@Controller

public class WebappController {

	@GetMapping(value = "/get")
	public String display() {
		return "hello.html";
	}
	
	@GetMapping(value="/post")
	public String display1() {
		return "Cheetha runs faster";
		
	}
	
	/*@GetMapping(value="/product")
	public int show() {
		return 9000;
	}*/
	
	@GetMapping(value = "/getname/{a}")
	public String displays(@PathVariable String a) {
		return "Hello "+ a;
	}
	
	//Add two numbers
	@GetMapping(value="/name/{a}/{b}")
	public int show(@PathVariable int a, @PathVariable int b) {
		return a+b;
	}
		
	//print vowels for oneword
	@GetMapping(value="/word/{c}")
	public String show1(@PathVariable String c) {
		String str=" ";
		for(int i=0;i<c.length();i++) {
			if(c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u') {		
				
				str=str+c.charAt(i);
		}
		
	}
		return str;
	
	}
	
	//print lastletter//
	
	@GetMapping(value = "/last/{a}")
	public char lastletter(@PathVariable String a) {
	char b=a.charAt(a.length()-1);
	return b;
	}
	
	//concat two//
	
	
	@GetMapping(value="/connect/{a}/{b}")
	public String joins(@PathVariable String a,@PathVariable String b) {
		String c=a.concat(b);
		return c.toUpperCase();
	}
	
	@GetMapping(value ="/primes/{a}/{b}")
	public List<Integer> primenumber(@PathVariable int a, @PathVariable int b){
		ArrayList<Integer> prime=new ArrayList<>();

	for(int i=a;i<b;i++) {
		boolean c=true;
		for(int j=0;j<i;j++) {
			if(i%2==0) {
				c=false;
			}
		}
		if(c==true) {
			prime.add(i);
		}
			
		}
	return prime;
	}
	
	
		@GetMapping(value="/ad")
		public Car displaycar(@RequestBody Car a) {
			return a;
		}
		

@GetMapping(value="/ads")
public List<Car>cars(@RequestBody List<Car>a){
	List<Car>maxpricecar=a.stream().sorted(Comparator.comparing(Car::getPrice).reversed())
			.limit(1).collect(Collectors.toList());
	
	return maxpricecar;	
}



}


		class Car {
			
		
	 private   String brand;
	 private   int price;
	 private   String color;
		    
		   public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			   
		} 
	

	

