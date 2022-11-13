package com.capstone.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.ecommerce.models.Coupon;

public interface CouponDao extends JpaRepository<Coupon, Integer> {

}
