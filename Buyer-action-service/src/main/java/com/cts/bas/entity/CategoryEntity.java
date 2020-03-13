package com.cts.bas.entity;

import javax.persistence.*;

@Entity
@Table(name="Categories")
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cId")
	private int categoryId;
	@Column(name="cName")
	private String categoryName;
	@Column(name="gstPer")
	private int gstPercentage;
	
	public CategoryEntity() {
		
	}

	public CategoryEntity(int categoryId, String categoryName, int gstPercentage) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.gstPercentage = gstPercentage;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getGstPercentage() {
		return gstPercentage;
	}

	public void setGstPercentage(int gstPercentage) {
		this.gstPercentage = gstPercentage;
	}

}
