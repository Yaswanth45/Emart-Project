package com.cts.bas.model;
public class OrderDetails {
	private int id;	
    private String name;
	private String quantity;
	private Double totalAmount;
	public OrderDetails() {
		
	}
	public OrderDetails(int id,String name, String quantity, Double totalAmount) {
	
		this.id = id;
		this.name=name;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}


