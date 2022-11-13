package com.capstone.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	private int cartId;

	public Cart() {
		super();
	}

	public Cart(int cartId) {
		super();
		this.cartId = cartId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + "]";
	}
}
