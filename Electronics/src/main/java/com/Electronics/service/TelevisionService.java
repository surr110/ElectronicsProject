package com.Electronics.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Electronics.dao.TelevisionDao;

import com.Electronics.entity.Television;

@Service

public class TelevisionService {
	@Autowired
	TelevisionDao td;

	public String setTv(Television t) {
		return td.setTv(t);
	}

	public List<Television> getTv() {
		return td.getTv();
	}

	public Television getTvid(int a) {
		// TODO Auto-generated method stub
		return td.getTvid(a);
	}

	public String deletetvid(int a) {
		// TODO Auto-generated method stub
		return td.deletetvid(a);
	}

	public String updated(int b, Television a) {
		Television c = getTvid(b);
		c.setBrand(a.getBrand());
		c.setPrice(a.getPrice());
		c.setIsled(a.isIsled());
		c.setColor(a.getColor());

		return td.updated(a);

	}

	public List<String> getBrand() {
		List<Television> t = getTv();
		List<String> tv = t.stream().map(s -> s.getBrand()).collect(Collectors.toList());

		return tv;
	}

	// maximum brand price//

	public int getBrand1() {
		List<Television> t = getTv();
		int max = t.stream().map(x -> x.getPrice()).max(Integer::compare).get();
		return max;
	}

// color//

	public List<Television> getcolor() {
		List<Television> t = getTv();
		List<Television> blackcolor = t.stream().filter(x -> x.getColor().equals("Black")).toList();
		return blackcolor;
	}

	public List<Television> getBrands() {
		List<Television> tv = getTv();
		List<Television> pricelist = tv.stream().filter(x -> x.getPrice() > 20000).collect(Collectors.toList());
		return pricelist;
	}

	public long getBrand2() {
		List<Television> tv = getTv();
		long pricecount = tv.stream().filter(y -> y.getPrice() > 20000).count();
		return pricecount;
	}

	public List<String> getBrands1() {
		List<Television> tv = getTv();
		List<String> brandlist = tv.stream().filter(x -> x.isIsled() == false).map(y -> y.getBrand())
				.collect(Collectors.toList());
		return brandlist;
	}

	public List<Television> getBlist(int a, int b) {
		List<Television> tv = getTv();
		List<Television> listfilter = tv.stream().filter(x -> x.getPrice() > a && x.getPrice() < b)
				.collect(Collectors.toList());
		return listfilter;
	}

	public List<String> gettlist(int a, int b) {
		List<Television> tv = getTv();
		List<String> listprice = tv.stream().filter(x -> x.getPrice() > a && x.getPrice() < b).map(y -> y.getBrand())
				.toList();
		return listprice;
	}

	public List<Television> getdisBrand(int a) {
		List<Television> tv = getTv();

		List<Television> dispricelist = tv.stream().map(e -> {
			int dispr = e.getPrice() - e.getPrice() * a / 100;
			e.setPrice(dispr);
			return e;
		}).collect(Collectors.toList());

		return dispricelist;

	}

	public List<Television> getdiscoBrand(int a, int b, int c) {
		List<Television> tv = getTv();
		List<Television> dissprice = tv.stream().filter(x -> x.getPrice() > a && x.getPrice() < b).map(e -> {
			int dprice = e.getPrice() - e.getPrice() * c / 100;
			e.setPrice(dprice);
			return e;
		}).collect(Collectors.toList());
		return dissprice;

	}

	public List<Television> getBycolor(String a) {
		return td.getBycolor(a);

	}

	public List<Television> getmaxPrice() {

		return td.getmaxPrice();
	}

	public int getminiprice() {

		return td.getminiprice();
	}

	public List<String> getblength(int a) {

		return td.getblength(a);
	}

	public long getablength(int a, int b) {
		
		return td.getablength(a, b);
	}

	public List<String> getabslength(int a, int b) {

		return td.getabslength(a, b);
	}
//<-----------------JQuery---------------->//
	
	public List<Television> getPriceRange(int n1, int n2) {

		return td.getPriceRange(n1, n2);
	}
	
	/*public List<Television> getTvpricerange(int n1, int n2) {
		// TODO Auto-generated method stub
		return td.getTvpricerange(n1,n2);
	} */

	public List<Television> getByPrice(int n) {
		
		return td.getByPrice(n);
	}

	public List<Television> getsamebrand(String n) {
	
		return td.getsamebrand(n);
	}

	public List<Television> getTvbrandlength(int a, int b) {
		
		return td.getTvbrandlength(a,b);
	}

	public List<Television> getTVlength(int a) {
		
		return td.getTVlength(a);
	}

	

}
