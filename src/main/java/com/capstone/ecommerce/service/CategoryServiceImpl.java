package com.capstone.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.ecommerce.dao.CategoryDao;
import com.capstone.ecommerce.models.Category;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao catDao;
	
	@Override
	public Category addCategory(Category category) {
		catDao.save(category);
		return category;
	}
	
	public List<Category> getCategories() {
		return catDao.findAll();
	}
	
	public Category updateCategory(Category category) {
		catDao.save(category);
		return category;
	}
	
	public void deleteCategory(int categoryId) {
		Category category = catDao.getReferenceById(categoryId);
		catDao.delete(category);
	}
}
