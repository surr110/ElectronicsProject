package com.UseProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UseProductController {
	@Autowired
	RestTemplate rt;

	@GetMapping(value = "/getPricewithtax")
	public List<Product> getThis() {
		String pro = "http://localhost:8081/getAll";
		String gst = "http://localhost:8082/getHsn/ ";
		ResponseEntity<List<Product>> pp = rt.exchange(pro, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Product>>() {
				});
		
		List<Product> prodetail=pp.getBody();
		
		
		prodetail.forEach(x->{int hsn = x.getHSNcode();
		ResponseEntity<Integer> ip =rt.exchange(gst+hsn, HttpMethod.GET, null, Integer.class);
		Integer per=ip.getBody();
		int netPrice=x.getPrice()+(x.getPrice()*per/100);
		x.setPrice(netPrice);
	
	});
		return prodetail;
	}
}
