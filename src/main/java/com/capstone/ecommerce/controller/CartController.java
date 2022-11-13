package com.capstone.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.ecommerce.models.Cart;
import com.capstone.ecommerce.service.CartService;

@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/addCart")
	public Cart addCart(@RequestBody Cart cart) {
		return this.cartService.addCart(cart);
	}
	
	@DeleteMapping("/cart/{cartId}")
	public ResponseEntity<HttpStatus>deleteCart(@PathVariable String cartId) {
		try {
			this.cartService.deleteCart(Integer.parseInt(cartId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
