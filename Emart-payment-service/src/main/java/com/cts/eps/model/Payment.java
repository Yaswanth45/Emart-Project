package com.cts.eps.model;


public class Payment {
	private int payId;
	private String nameOnCard;
	private String creditCardNumber;
	private String expiryMonth;
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


