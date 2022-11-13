package com.capstone.ecommerce.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Payments {
	
	@Id
	private int paymentId;
	private double cartCost;
	private long cardNo;
	private int cvv;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expiry;

	public Payments() {
		super();
	}

	public Payments(int paymentId, double cartCost, long cardNo, int cvv, Date expiry) {
		super();
		this.paymentId = paymentId;
		this.cartCost = cartCost;
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expiry = expiry;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public double getCartCost() {
		return cartCost;
	}

	public void setCartCost(double cartCost) {
		this.cartCost = cartCost;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
}
