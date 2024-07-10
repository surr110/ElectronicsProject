package com.Flipkart.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Flipkart.orderdao.OrderDao;
import com.Flipkart.orderentity.OrderEntity;
@Service
public class OrderService {
@Autowired
OrderDao od;

	public String setAll(OrderEntity o) {
		
		return od.setAll(o);
	}

}
