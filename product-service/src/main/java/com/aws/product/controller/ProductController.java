package com.aws.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.product.service.ProductService;

@RestController
@RequestMapping("/items")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping()
	public List<String> getallProducts() {
		return productService.getProducts();
	}

	@GetMapping("/{id}")
	public String getProductById(@PathVariable String id) {
		return productService.getProductById(id);
	}
}
