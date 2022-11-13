package com.capstone.ecommerce.service;

import java.util.List;

import com.capstone.ecommerce.models.Products;

public interface ProductService {
	
	public Products addProduct(Products product);
	
	public List<Products> getProducts();
	
	public Products updateProduct(Products product);
	
	public void deleteProduct(int productId);
	
}
