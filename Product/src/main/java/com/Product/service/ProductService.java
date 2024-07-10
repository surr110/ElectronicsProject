package com.Product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.dao.ProductDao;
import com.Product.entity.Product;
@Service
public class ProductService {
	@Autowired
	ProductDao pd;

	public String setAll(List<Product> p) {
	
		return pd.setAll(p);
	}

	public List<Product> getall() {
		
		return pd.getall();
	}

}
