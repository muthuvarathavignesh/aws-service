package com.aws.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CartService {

	@Value("${product.service.url}")
	private String productServiceUrl;
	
	@Autowired
	RestTemplate restTemplate;

	public String getCartByUserId(String userId) {
		String value  = restTemplate.getForObject(productServiceUrl + "/products/" + userId, String.class);
		return value;
	}
}
