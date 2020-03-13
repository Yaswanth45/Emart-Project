package com.cts.sas.model;

import java.time.LocalDate;


public class Orders {
	
	private int orderId;
	private LocalDate orderDate;
	private double totalAmount;
	private String discountId;
	private int  discountValue;
	
	public Orders() {
		
	}

	public Orders(int orderId, LocalDate orderDate, double totalAmount, String discountId, int discountValue) {
		
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.discountId = discountId;
		this.discountValue = discountValue;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public int getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}
}
