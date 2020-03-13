package com.cts.eps.entity;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Payments")

public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payId;
	@Column(name="nameCard")
	private String nameOnCard;
	@Column(name="creditNumber")
	private String creditCardNumber;
	@Column(name="expMon")
	private String expiryMonth;
	@Column(name="expYear")
	private String expiryYear;
	
	public Payment() {
		
	}

	public Payment(int payId, String nameOnCard, String creditCardNumber, String expiryMonth, String expiryYear) {
		
		this.payId = payId;
		this.nameOnCard = nameOnCard;
		this.creditCardNumber = creditCardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}

	public int getPayId() {
		return payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
}
