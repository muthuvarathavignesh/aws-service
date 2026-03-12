package com.aws.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.cart.service.CartService;

@RestController
@RequestMapping("/items")
public class CartController {

	@Autowired
	CartService cartService;
	
	@GetMapping("/{userId}")
	public String getCart(@PathVariable String userId) {
		// Logic to retrieve the cart for the given userId
		return cartService.getCartByUserId(userId);
	}

	@GetMapping("")
	public String geMessage() {
		// Logic to retrieve the cart for the given userId
		return "Welcome to Cart Service";
	}
}
