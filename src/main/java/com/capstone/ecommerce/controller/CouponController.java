package com.capstone.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.ecommerce.models.Coupon;
import com.capstone.ecommerce.service.CouponService;

@RestController
public class CouponController {
	
	@Autowired
	private CouponService couponService;

	@PostMapping("/addCoupon")
	public Coupon addCoupon(@RequestBody Coupon coupon) {
		return this.couponService.addCoupon(coupon);
	}
	
	@GetMapping("/coupons")
	public List<Coupon> getCoupons() {
		return this.couponService.getCoupons();
	}
	
	@PutMapping("/coupons")
	public Coupon updateCoupon(@RequestBody Coupon coupon) {
		return this.couponService.updateCoupon(coupon);
	}
	
	@DeleteMapping("/coupons/{couponId}")
	public ResponseEntity<HttpStatus>deleteCoupon(@PathVariable String couponId) {
		try {
			this.couponService.deleteCoupon(Integer.parseInt(couponId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
