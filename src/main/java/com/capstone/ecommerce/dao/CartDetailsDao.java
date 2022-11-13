package com.capstone.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.ecommerce.models.CartDetails;

public interface CartDetailsDao extends JpaRepository<CartDetails, Integer>{

}
