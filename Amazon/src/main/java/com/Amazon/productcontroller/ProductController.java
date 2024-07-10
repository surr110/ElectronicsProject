package com.Amazon.productcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Amazon.orderentity.OrderEntity;
import com.Amazon.productentity.ProductEntity;
import com.Amazon.productservice.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping
	public List<ProductEntity> getAllProducts() {
		return productService.getAllProducts();
	}

	@PostMapping("/save")
	public ProductEntity saveProduct(@RequestBody ProductEntity product) {
		return productService.saveProduct(product);
	}

	@PostMapping("/{productId}/orders/save")
	public OrderEntity saveOrder(@PathVariable int productId, @RequestBody OrderEntity order) {
		return productService.saveOrder(productId, order);
	}

	@GetMapping("/orders")
	public List<OrderEntity> getAllOrders() {
		return productService.getAllOrders();
	}
}
