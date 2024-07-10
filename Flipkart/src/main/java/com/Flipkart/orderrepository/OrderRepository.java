package com.Flipkart.orderrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flipkart.orderentity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
	

}
