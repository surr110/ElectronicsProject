package com.Flipkart.orderdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Flipkart.orderentity.OrderEntity;
import com.Flipkart.orderrepository.OrderRepository;
@Repository
public class OrderDao {
	@Autowired
	OrderRepository or;

	public String setAll(OrderEntity o) {
		or.save(o);
		
		return "Saved Successfully";
	}

}
