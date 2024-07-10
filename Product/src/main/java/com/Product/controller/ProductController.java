package com.Product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Product.entity.Product;
import com.Product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;

	@PostMapping(value = "/PostAll")
	public String setAll(@RequestBody List<Product> p) {

		return ps.setAll(p);

	}

	@GetMapping(value = "/getAll")
	public List<Product> getall() {
		return ps.getall();
	}

}
