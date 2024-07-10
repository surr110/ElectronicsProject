package com.Hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	@Autowired
	RestTemplate rt;

	@GetMapping(value = "/getHello")
	public String getThis() {

		String url = "http://localhost:8081/getHi";

		ResponseEntity<String> x = rt.exchange(url, HttpMethod.GET, null, String.class);

		String s = x.getBody();
		return s;
	}
	
	@GetMapping(value="/getTestingHello")
	public byte[] getHellothis( ) {
		String url="http://localhost:8081/getHi";
		String x=rt.getForObject(url, String.class);
		byte[] s=x.getBytes();
		return s;
	}


	@GetMapping(value = "/gettingAll")
	public List<Television> getTvs() {
		String url = "http://localhost:8080/TV/getAll";
		ResponseEntity<List<Television>> tv = rt.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Television>>() {
				});

		List<Television> s = tv.getBody();
		return s;

	}

	@GetMapping(value = "/getonlybrandname")
	public List<String> getTvbrand() {
		String url = "http://localhost:8080/TV/getAll";
		ResponseEntity<List<Television>> tv = rt.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Television>>() {
				});
		List<String> s = tv.getBody().stream().map(x -> x.getBrand()).toList();
		return s;
	}

	@GetMapping(value = "/getonlyprice")
	public List<Integer> getTvprice() {
		String url = "http://localhost:8080/TV/getAll";
		ResponseEntity<List<Television>> tv = rt.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Television>>() {
				});

		List<Integer> price = tv.getBody().stream().map(x -> x.getPrice()).toList();
		return price;
	}

}
