package com.capstone.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.ecommerce.dao.CouponDao;
import com.capstone.ecommerce.models.Coupon;

@Service
public class CouponServiceImpl implements CouponService{
	
	@Autowired
	private CouponDao cDao;
	
	@Override
	public Coupon addCoupon(Coupon coupon) {
		cDao.save(coupon);
		return coupon;
	}
	
	@Override
	public List<Coupon> getCoupons() {
		return cDao.findAll();
	}
	
	public Coupon updateCoupon(Coupon coupon) {
		cDao.save(coupon);
		return coupon;
	}
	
	public void deleteCoupon(int couponId) {
		Coupon coupon = cDao.getReferenceById(couponId);
		cDao.delete(coupon);
	}
}
