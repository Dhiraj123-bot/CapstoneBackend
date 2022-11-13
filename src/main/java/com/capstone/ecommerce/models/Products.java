package com.capstone.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	
	@Id
	private int productId;
	private String productName;
	private int price;
	private String imgPath;
	
	public Products() {
		super();
	}

	public Products(int productId, String productName, int price, String imgPath) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.imgPath = imgPath;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
}
