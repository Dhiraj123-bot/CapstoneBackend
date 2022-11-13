package com.capstone.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.ecommerce.dao.CartDao;
import com.capstone.ecommerce.models.Cart;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDao cartDao;
	
	@Override
	public Cart addCart(Cart cart) {
		return cartDao.save(cart);
	}

	@Override
	public void deleteCart(int cartId) {
		Cart cart = cartDao.getReferenceById(cartId);
		cartDao.delete(cart);
	}

}
