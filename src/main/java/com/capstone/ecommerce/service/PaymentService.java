package com.capstone.ecommerce.service;

import java.util.List;

import com.capstone.ecommerce.models.Payments;

public interface PaymentService {
	
	public Payments addPayment(Payments payment);
	
	public List<Payments> getPayment();
	
	public Payments updatePayment(Payments payment);
	
	public void deletePayment(int paymentId);
}
