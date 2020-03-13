package com.cts.sas.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="Orders")
public class OrdersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="oId")
	private int orderId;
	@Column(name="oDate")
	private LocalDate orderDate;
	private double totalAmount;
	@Column(name="discId")
	private String discountId;
	@Column(name="discVal")
	private int  discountValue;
	
	public OrdersEntity() {
		
	}

	public OrdersEntity(int orderId, LocalDate orderDate, double totalAmount, String discountId, int discountValue) {
		
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
