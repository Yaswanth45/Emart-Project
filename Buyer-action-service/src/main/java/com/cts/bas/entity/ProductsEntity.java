package com.cts.bas.entity;

import javax.persistence.*;

@Entity
@Table(name="Products")
public class ProductsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pId")
	private int productId;
	@Column(name="pName")
	private String productName;
	@Column(name="price")
	private double productPrice;
	@Column(name="pDesc")
	private String productDesc;
	@ManyToOne
	@JoinColumn(name="sId")
	private SubCategoryEntity subCategory;
	
	public ProductsEntity() {
		
	}

	public ProductsEntity(int productId, String productName, double productPrice, String productDesc,
			SubCategoryEntity subCategory) {
		
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDesc = productDesc;
		this.subCategory = subCategory;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public SubCategoryEntity getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategoryEntity subCategory) {
		this.subCategory = subCategory;
	}
	
}
