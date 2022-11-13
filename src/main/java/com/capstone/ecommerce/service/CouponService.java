package com.capstone.ecommerce.service;

import java.util.List;

import com.capstone.ecommerce.models.Coupon;

public interface CouponService {
	
	public Coupon addCoupon(Coupon coupon);
	
	public List<Coupon> getCoupons();
	
	public Coupon updateCoupon(Coupon coupon);
	
	public void deleteCoupon(int couponId);
	
}
