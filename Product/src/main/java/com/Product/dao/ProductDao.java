package com.Product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Product.entity.Product;
import com.Product.repo.ProductRepo;
@Repository

public class ProductDao {
	@Autowired
	ProductRepo pr;

	public String setAll(List<Product> p) {
	     pr.saveAll(p);
		return "<--------Saved All Successfully------->";
		
	
		
	}

	public List<Product> getall() {
		
		return pr.findAll();
	}

}
