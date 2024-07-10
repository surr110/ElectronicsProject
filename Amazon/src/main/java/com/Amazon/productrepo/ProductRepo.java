package com.Amazon.productrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amazon.productentity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
