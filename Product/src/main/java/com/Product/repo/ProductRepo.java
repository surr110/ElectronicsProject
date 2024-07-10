package com.Product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Product.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
