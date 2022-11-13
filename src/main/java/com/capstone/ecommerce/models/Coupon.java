package com.capstone.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupon {
	
	@Id
	private int couponId;
	private String couponName;
	
	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponName) {
		super();
		this.couponId = couponId;
		this.couponName = couponName;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	
}
