package com.cts.bas.service;

import java.util.Optional;

import com.cts.bas.model.SubCategory;

public interface SubCategoryService {
	Optional<SubCategory> findBySubCategoryName(String subCategoryName);
}
