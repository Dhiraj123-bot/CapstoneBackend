package com.capstone.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.ecommerce.models.Cart;

public interface CartDao extends JpaRepository<Cart, Integer> {

}
