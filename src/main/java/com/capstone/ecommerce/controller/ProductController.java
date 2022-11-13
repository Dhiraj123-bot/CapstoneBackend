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

import com.capstone.ecommerce.models.Products;
import com.capstone.ecommerce.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService pService;
	
	@PostMapping("/addProduct")
	public Products addProduct(@RequestBody Products product) {
		return this.pService.addProduct(product);
	}
	
	@GetMapping("/products")
	public List<Products> getProducts() {
		return this.pService.getProducts();
	}
	
	@PutMapping("/products")
	public Products updateProduct(@RequestBody Products product) {
		return this.pService.updateProduct(product);
	}
	
	@DeleteMapping("/product/{productId}")
	public ResponseEntity<HttpStatus>deleteProduct(@PathVariable String productId) {
		try {
			this.pService.deleteProduct(Integer.parseInt(productId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
