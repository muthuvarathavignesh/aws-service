package com.aws.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public List<String> getProducts() {
		return List.of("Product 1", "Product 2", "Product 3");
	}
	
	public String getProductById(String id) {
		return "Product " + id;
	}
}
