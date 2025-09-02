package com.productcart.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productcart.model.Cart;

@RestController
@RequestMapping("/cart-service/v1")
public class CartController {
	
	@PostMapping("/cart-info/add-to-cart")
	ResponseEntity<Cart> addToCart(@RequestParam int userId,@RequestParam int productId, @RequestParam int quantity){
		return null;
		
	}
	@PutMapping("/cart-info/update-cart")
	ResponseEntity<Cart> updateCart(@RequestParam int userId,@RequestParam int productId, @RequestParam int quantity){
		return null;
		
	}
	
	
	
	@DeleteMapping("/cart-info/view-cart/userId/{userId}")
	ResponseEntity<Cart> removeFromCart(@PathVariable int userId){
		return null;
		
	}
	@GetMapping("/cart-info/view-cart/userId/{userId}")
	ResponseEntity<Cart> viewCart(@PathVariable int userId){
		return null;
		
	}
	@DeleteMapping("/cart-info/view-cart/userId/{userId}")
	ResponseEntity<Cart> clearCart(@PathVariable int userId){
		return null;
		
	}
}
