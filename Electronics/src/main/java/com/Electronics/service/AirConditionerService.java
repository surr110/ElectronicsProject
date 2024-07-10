package com.Electronics.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Electronics.dao.AirConditionerDao;
import com.Electronics.entity.AirConditioner;

@Service

public class AirConditionerService {
	@Autowired
	AirConditionerDao ad;

	public String setAc(AirConditioner a) {
		return ad.setAc(a);
	}

	public List<AirConditioner> getAc() {
		return ad.getAc();
	}

	public AirConditioner getAcByid(int a) {

		return ad.getAcByid(a);
	}

	public String deleteidac(int a) {

		return ad.deleteidac(a);
	}

	public String updata(int b, AirConditioner a) {
		AirConditioner x = getAcByid(b);
		x.setBrand(a.getBrand());
		x.setPrice(a.getPrice());
		x.setIsenergysaver(a.isIsenergysaver());
		x.setColor(a.getColor());

		return ad.updata(a);

	}

	public List<String> getBrand() {
		List<AirConditioner> ac = getAc();
		List<String> acs = ac.stream().map(s -> s.getBrand()).collect(Collectors.toList());
		return acs;
	}

	public int getBrand1() {
		List<AirConditioner> ac=getAc();
		int max =ac.stream().map(x->x.getPrice()).max(Integer::compare).get();
		return max;
	}

	public List<AirConditioner> getcolor() {
		List<AirConditioner> ac=getAc();
		List<AirConditioner>accolor=ac.stream().filter(x->x.getColor().equals("silver")).toList();
		return accolor;
	}

	public List<AirConditioner> getBrands() {
		List<AirConditioner> ac=getAc();
		List<AirConditioner>pricelist=ac.stream().filter(x->x.getPrice()>20000).toList();
		return pricelist;
	}

	public long getBrand2() {
	   List<AirConditioner> ac=getAc();
	   long pricecount=ac.stream().filter(x->x.getPrice()>20000).count();
		return pricecount;
	}

	public List<AirConditioner> getBrand3() {
		List<AirConditioner> ac=getAc();
		List<AirConditioner> startletter=ac.stream().filter(x->x.getBrand().startsWith("G")).toList();
		
		return startletter;
	}

	public List<AirConditioner> getbyBrand(String a) {
		List<AirConditioner> ac=getAc();
		List<AirConditioner> brandmatch=ac.stream().filter(x->x.getBrand().equals(a)).collect(Collectors.toList());
		return brandmatch;
	}

	public List<AirConditioner> getdisbrand(String a, int b) {
		List<AirConditioner>ac=getAc();
		
		List<AirConditioner>pricediscount=ac.stream().filter(x->x.getBrand().equals(a))
				.map(e->{int disprice=e.getPrice()-e.getPrice()*b/100;
				e.setPrice(disprice);
				return e;
				}).collect(Collectors.toList());
		
		return pricediscount;
	}
	

}
