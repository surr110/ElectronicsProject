package com.Flipkart.ordercontroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Flipkart.orderentity.OrderEntity;
import com.Flipkart.orderservice.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class OrderController {
@Autowired
OrderService os;

@PostMapping("/Postdata")
public String setAll(@RequestBody OrderEntity o) {
    
    return os.setAll(o);
}

}
