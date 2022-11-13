package com.capstone.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.ecommerce.models.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
