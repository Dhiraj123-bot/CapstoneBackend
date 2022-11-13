package com.capstone.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.ecommerce.dao.ProductsDao;
import com.capstone.ecommerce.models.Products;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductsDao productDao;

	@Override
	public Products addProduct(Products product) {
		return productDao.save(product);
	}

	@Override
	public List<Products> getProducts() {
		return productDao.findAll();
	}

	@Override
	public Products updateProduct(Products product) {
		 productDao.save(product);
		 return product;
	}

	@Override
	public void deleteProduct(int productId) {
		Products product = productDao.getReferenceById(productId);
		productDao.delete(product);
	}

}
