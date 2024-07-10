package com.Amazon.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Amazon.orderentity.OrderEntity;
import com.Amazon.productdao.ProductDao;
import com.Amazon.productentity.ProductEntity;
import com.Amazon.productrepo.OrederRepo;
import com.Amazon.productrepo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductDao pd;

	@Autowired
	private ProductRepo productRepository;

	@Autowired
	private OrederRepo orderRepository;

	public ProductEntity saveProduct(ProductEntity product) {
		return productRepository.save(product);
	}

	public OrderEntity saveOrder(int productId, OrderEntity order) {
		ProductEntity product = productRepository.findById(productId)
				.orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));
		order.setProduct(product);
		return orderRepository.save(order);
	}

	public List<ProductEntity> getAllProducts() {
		return productRepository.findAll();
	}

	public List<OrderEntity> getAllOrders() {
		return orderRepository.findAll();
	}
}