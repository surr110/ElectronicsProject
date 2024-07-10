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

import com.Electronics.entity.Television;
import com.Electronics.service.TelevisionService;

@RequestMapping(value = "/TV")
@RestController
public class TelevisionController {
	@Autowired
	TelevisionService ts;
	
	@PostMapping(value = "/set")
	public String setTv(@RequestBody Television t) {
		return ts.setTv(t);

	}

	@GetMapping(value = "/getAll")
	public List<Television> getTv() {
		return ts.getTv();
	}

	@GetMapping(value = "/getactv/{a}")
	public Television getTvid(@PathVariable int a) {
		return ts.getTvid(a);
	}

	@DeleteMapping(value = "/delete/{a}")
	public String deletetvid(@PathVariable int a) {
		return ts.deletetvid(a);
	}

	@PutMapping(value = "/updating/{b}")
	public String updated(@PathVariable int b, @RequestBody Television a) {
		return ts.updated(b, a);
	}

	@GetMapping(value = "/getAllbrands")
	public List<String> getBrand() {
		return ts.getBrand();
	}

	// brand price//

	@GetMapping(value = "/getbrandprice")
	public int getBrand1() {
		return ts.getBrand1();
	}

	// tv color//

	@GetMapping(value = "/getcolor")
	public List<Television> getcolor() {
		return ts.getcolor();
	}

	@GetMapping(value = "/getprices")
	public List<Television> getBrands() {
		return ts.getBrands();
	}

	@GetMapping(value = "/getcount")
	public long getBrand2() {
		return ts.getBrand2();
	}

	@GetMapping(value = "/getbrandlist")
	public List<String> getBrands1() {
		return ts.getBrands1();
	}

	@GetMapping(value = "/getblist/{a}/{b}")
	public List<Television> getBlist(@PathVariable int a, @PathVariable int b) {
		return ts.getBlist(a, b);
	}

	@GetMapping(value = "/gettlist/{a}/{b}")
	public List<String> gettlist(@PathVariable int a, @PathVariable int b) {
		return ts.gettlist(a, b);

	}

	@GetMapping(value = "/getdiscount/{a}")
	public List<Television> getdisBrand(@PathVariable int a) {
		return ts.getdisBrand(a);
	}

	@GetMapping(value = "/getdissc/{a}/{b}/{c}")
	public List<Television> getdiscoBrand(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
		return ts.getdiscoBrand(a, b, c);
	}

	//// created new Query in getByColor in Repository itself because we don't have
	//// predefine unique details in repository
	// so we are extending it by writing our own query...

	@GetMapping(value = "getcolordetail/{a}")
	public List<Television> getBycolor(@PathVariable String a) {
		return ts.getBycolor(a);
	}

	@GetMapping(value = "getmaxpricelist")
	public List<Television> getmaxPrice() {

		return ts.getmaxPrice();
	}

	@GetMapping(value = "getminpricelist")
	public int getminiprice() {
		return ts.getminiprice();
	}

	@GetMapping(value = "getbrandlength/{a}")
	public List<String> getblength(@PathVariable int a) {
		return ts.getblength(a);
	}

	@GetMapping(value = "getbbrands/{a}/{b}")
	public long getablength(@PathVariable int a, @PathVariable int b) {
		return ts.getablength(a, b);

	}

	@GetMapping(value = "getabsbrands/{a}/{b}")
	public List<String> getabslength(@PathVariable int a, @PathVariable int b) {
		return ts.getabslength(a, b);
	}

	//// <------->JQuery------------->

	@GetMapping(value = "getpricerange/{n1}/{n2}")
	public List<Television> getPriceRange(@PathVariable int n1, @PathVariable int n2) {
		return ts.getPriceRange(n1, n2);
	}

	/*
	 * @GetMapping(value="gettvpricerange/{n1}/{n2}") public List<Television>
	 * getTvpricerange(@Param int n1,@Param int n2){ return
	 * ts.getTvpricerange(n1,n2); }
	 */

	@GetMapping(value = "get_price/{n}")
	public List<Television> getByPrice(@PathVariable int n) {
		return ts.getByPrice(n);
	}

	@GetMapping(value = "getSameBrand/{n}")
	public List<Television> getsamebrand(@PathVariable String n) {
		return ts.getsamebrand(n);
	}
	@GetMapping(value="getTVBrandLength/{a}/{b}")
	public List<Television>getTvbrandlength(@PathVariable int a,@PathVariable int b) {
		return ts.getTvbrandlength(a,b);
		
	}
	@GetMapping(value="findTVlength/{a}")
	public List<Television> getTVlength(@PathVariable int a){
		return ts.getTVlength(a);
	}
}
