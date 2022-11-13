package com.capstone.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.ecommerce.models.CartDetails;
import com.capstone.ecommerce.service.CartDetailsService;

@RestController
public class CartDetailsController {
	
	@Autowired
	private CartDetailsService cartDService;
	
	@PostMapping("/addCartDetails")
	public CartDetails addCartDetails(@RequestBody CartDetails cartDetails) {
		return this.cartDService.addCartDetails(cartDetails);
	}
	
	@GetMapping("/cartDetails")
	public List<CartDetails> getCartDetails() {
		return this.cartDService.getCartDetails();
	}
	
	@PutMapping("/cartDetails")
	public CartDetails updateCartDetails(@RequestBody CartDetails cartDetails) {
		return this.cartDService.updateCartDetails(cartDetails);
	}
	
	@DeleteMapping("/cartDetails/{cartDetails}")
	public ResponseEntity<HttpStatus>deleteCartDetails(@PathVariable String cartDetailsId) {
		try {
			this.cartDService.deleteCartDetails(Integer.parseInt(cartDetailsId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
