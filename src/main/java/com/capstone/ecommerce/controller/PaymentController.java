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

import com.capstone.ecommerce.models.Payments;
import com.capstone.ecommerce.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService pService;
	
	@PostMapping("/addPayment")
	public Payments addPayment(@RequestBody Payments payment) {
		return this.pService.addPayment(payment);
	}
	
	@GetMapping("/payments")
	public List<Payments> getPayments() {
		return this.pService.getPayment();
	}
	
	@PutMapping("/payments")
	public Payments updatePayment(@RequestBody Payments payment) {
		return this.pService.updatePayment(payment);
	}
	
	@DeleteMapping("/payment/{paymentId}")
	public ResponseEntity<HttpStatus>deletePayment(@PathVariable String paymentId) {
		try {
			this.pService.deletePayment(Integer.parseInt(paymentId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
