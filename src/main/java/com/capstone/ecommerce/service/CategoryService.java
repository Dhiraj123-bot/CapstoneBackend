package com.capstone.ecommerce.service;

import java.util.List;

import com.capstone.ecommerce.models.Category;

public interface CategoryService {
	
	public Category addCategory(Category category);
	
	public List<Category> getCategories();
	
	public Category updateCategory(Category cateagory);
	
	public void deleteCategory(int categoryId);
	
}
