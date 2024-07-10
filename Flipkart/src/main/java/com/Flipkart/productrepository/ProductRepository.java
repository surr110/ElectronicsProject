package com.Flipkart.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flipkart.productentity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
