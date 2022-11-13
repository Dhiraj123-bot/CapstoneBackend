package com.capstone.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.ecommerce.models.Payments;

public interface PaymentsDao extends JpaRepository<Payments, Integer> {

}
