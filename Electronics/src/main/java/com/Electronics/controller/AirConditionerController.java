package com.Electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Electronics.entity.AirConditioner;
import com.Electronics.service.AirConditionerService;
@RequestMapping(value="/AC")
@RestController
public class AirConditionerController {
	@Autowired
	AirConditionerService as;

	@PostMapping(value = "/set")
	public String setAc(@RequestBody AirConditioner a) {
		return as.setAc(a);

	}

	@GetMapping(value = "/getAll")
	public List<AirConditioner> getAc() {
		return as.getAc();
	}
	
	@GetMapping(value="/getactv/{a}")
	public AirConditioner getAcByid(@PathVariable int a) {
		return as.getAcByid(a);
	}
	
	@DeleteMapping(value="/delete/{a}")
	public String deleteidac(@PathVariable int a) {
	 return	as.deleteidac(a);
		 
	}
	
	@PutMapping(value="/updating/{b}")
	public String updata(@PathVariable int b, @RequestBody AirConditioner a ) {
		return as.updata(b,a);
				
}
	@GetMapping(value="/getAllbrands")
	public List<String> getBrand(){
		return as.getBrand();
	
}
	@GetMapping(value="/getbrandprice")
	public int getBrand1() {
		return as.getBrand1();
	}
	
	@GetMapping(value="/getcolor")
	public List<AirConditioner> getcolor(){
		return as.getcolor();
	}
	
	@GetMapping(value="/getprices")
	public List<AirConditioner> getBrands(){
		return as.getBrands();
	}
	
	@GetMapping(value="/getcount")
	public long getBrand2() {
		return as.getBrand2();
		
	}
	
	@GetMapping(value="/getletter")
	public List<AirConditioner> getBrand3() {
		return as.getBrand3();
	}
	@GetMapping(value="/getbrandname/{a}")
	public List<AirConditioner> getbyBrand(@PathVariable String a){
		return as.getbyBrand(a);
		
	}
	@GetMapping(value="/getdiscount/{a}/{b}")
	public List<AirConditioner>getdisbrand(@PathVariable String a, @PathVariable int b){
		return as.getdisbrand(a,b);
	}
}
