package com.Amazon.productrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amazon.orderentity.OrderEntity;

public interface OrederRepo extends JpaRepository<OrderEntity, Integer> {

}
