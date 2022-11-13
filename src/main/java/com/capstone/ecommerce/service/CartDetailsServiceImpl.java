package com.capstone.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.ecommerce.dao.CartDetailsDao;
import com.capstone.ecommerce.models.CartDetails;

@Service
public class CartDetailsServiceImpl implements CartDetailsService {
	
	@Autowired
	private CartDetailsDao cartDetailsDao;

	@Override
	public CartDetails addCartDetails(CartDetails cartDetails) {
		return cartDetailsDao.save(cartDetails);
	}

	@Override
	public List<CartDetails> getCartDetails() {
		return cartDetailsDao.findAll();
	}

	@Override
	public CartDetails updateCartDetails(CartDetails cartDetails) {
		cartDetailsDao.save(cartDetails);
		return cartDetails;
	}

	@Override
	public void deleteCartDetails(int cartDetailsId) {
		CartDetails cartDetails = cartDetailsDao.getReferenceById(cartDetailsId);
		cartDetailsDao.delete(cartDetails);
	}

}
