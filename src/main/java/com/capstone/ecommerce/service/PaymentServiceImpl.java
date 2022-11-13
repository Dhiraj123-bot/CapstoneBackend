package com.capstone.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.ecommerce.dao.PaymentsDao;
import com.capstone.ecommerce.models.Payments;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentsDao pDao;
	
	@Override
	public Payments addPayment(Payments payment) {
		return pDao.save(payment);
	}
	
	public List<Payments> getPayment() {
		return pDao.findAll();
	}
	
	public Payments updatePayment(Payments payment) {
		pDao.save(payment);
		return payment;
	}
	
	public void deletePayment(int paymentId) {
		Payments payment = pDao.getReferenceById(paymentId);
		pDao.delete(payment);
	}
}
