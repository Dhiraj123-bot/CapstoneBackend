package com.capstone.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CartDetails {
	
	@Id
	private int cartDetailsId;
	private int quantity;
	
	public CartDetails() {
		super();
	}

	public CartDetails(int cartDetailsId, int quantity) {
		super();
		this.cartDetailsId = cartDetailsId;
		this.quantity = quantity;
	}

	public int getCartDetailsId() {
		return cartDetailsId;
	}

	public void setCartDetailsId(int cartDetailsId) {
		this.cartDetailsId = cartDetailsId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
