package com.Electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Electronics.entity.Television;
import com.Electronics.repo.TelevisionRepo;

@Repository
public class TelevisionDao {
	@Autowired
	TelevisionRepo tr;

	public String setTv(Television t) {
		tr.save(t);
		return "<-----Saved successfully----->";
	}

	public List<Television> getTv() {
		return tr.findAll();
	}

	public Television getTvid(int a) {
		return tr.findById(a).get();
	}

	public String deletetvid(int a) {
		tr.deleteById(a);
		return "<-------------Deleted SuccessFully------------->";
	}

	public String updated(Television a) {
		tr.save(a);

		return "<-----------Updated Successfully--------------->";
	}

	public List<Television> getBycolor(String a) {
		return tr.getBycolor(a);
	}

	public List<Television> getmaxPrice() {

		return tr.getmaxPrice();
	}

	public int getminiprice() {

		return tr.getminiprice();
	}

	public List<String> getblength(int a) {

		return tr.getblength(a);
	}

	public long getablength(int a, int b) {

		return tr.getablength(a, b);
	}

	public List<String> getabslength(int a, int b) {

		return tr.getabslength(a, b);
	}
	
	//<-----------------------JQuery-------------------->//

	public List<Television> getPriceRange(int n1, int n2) {

		return tr.getPriceRange(n1, n2);
	}

	/*public List<Television> getTvpricerange(int n1, int n2) {

		return tr.getTvpricerange(n1,n2);
	}*/


	public List<Television> getByPrice(int n) {
		
		return tr.getByPrice(n);
	}

	public List<Television> getsamebrand(String n) {
		// TODO Auto-generated method stub
		return tr.getsamebrand(n);
	}

	public List<Television> getTvbrandlength(int a, int b) {
		
		return tr.getTvbrandlength(a, b);
	}

	public List<Television> getTVlength(int a) {
		
		return tr.getTVlength(a);
	}


}
