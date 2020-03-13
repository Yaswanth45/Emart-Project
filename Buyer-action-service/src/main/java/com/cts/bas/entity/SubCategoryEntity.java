package com.cts.bas.entity;

import javax.persistence.*;

@Entity
@Table(name="SubCategory")
public class SubCategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sId")
	private int subCategoryId;
	@Column(name="sName")
	private String subCategoryName;
	@ManyToOne
	@JoinColumn(name="cId")
	private CategoryEntity category;
	
	public SubCategoryEntity() {
		
	}

	public SubCategoryEntity(int subCategoryId, String subCategoryName, CategoryEntity category) {
		
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.category = category;
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	
}
