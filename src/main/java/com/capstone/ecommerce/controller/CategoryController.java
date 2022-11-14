package com.capstone.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.ecommerce.models.Category;
import com.capstone.ecommerce.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService catService;
	
	@PostMapping("/addCategory")
	@CrossOrigin(origins = "http://localhost:8081")
	public Category addCategory(@RequestBody Category category) {
		return this.catService.addCategory(category);
	}
	
	@GetMapping("/categories")
	public List<Category> getCategories() {
		return this.catService.getCategories();
	}
	
	@PutMapping("/categories")
	public Category updateCategory(@RequestBody Category category) {
		return this.catService.updateCategory(category);
	}
	
	@DeleteMapping("/categories/{categoryId}")
	public ResponseEntity<HttpStatus>deleteCategory(@PathVariable String categoryId) {
		try {
			this.catService.deleteCategory(Integer.parseInt(categoryId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
