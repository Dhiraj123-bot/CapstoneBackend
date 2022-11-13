package com.capstone.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.ecommerce.models.Products;

public interface ProductsDao extends JpaRepository<Products, Integer> {

}
