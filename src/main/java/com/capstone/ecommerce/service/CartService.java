package com.capstone.ecommerce.service;

import com.capstone.ecommerce.models.Cart;

public interface CartService {
	
	public Cart addCart(Cart cart);
	
	public void deleteCart(int cartId);
	
}
