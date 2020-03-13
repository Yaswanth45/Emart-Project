package com.cts.sas.service;

import java.util.Optional;

import com.cts.sas.entity.SubCategoryEntity;
import com.cts.sas.model.SubCategory;

public interface SubCategoryService {
	Optional<SubCategory> findBySubCategoryName(String subCategoryName);

	void addSubCategories(SubCategoryEntity subc);

	void updateSubCategories(SubCategoryEntity subc);
}
