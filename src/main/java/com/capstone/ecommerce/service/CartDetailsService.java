package com.capstone.ecommerce.service;

import java.util.List;

import com.capstone.ecommerce.models.CartDetails;

public interface CartDetailsService {
	
	public CartDetails addCartDetails(CartDetails cartDetails);
	
	public List<CartDetails> getCartDetails();
	
	public CartDetails updateCartDetails(CartDetails cartDetails);
	
	public void deleteCartDetails(int cartDetailsId);
	
}
