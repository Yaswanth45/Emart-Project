package com.cts.sas.service;

import java.util.Optional;

import com.cts.sas.entity.CategoryEntity;
import com.cts.sas.model.Category;

public interface CategoryService {

	Optional<Category> findByCategoryName(String categoryName);

	void addCategories(CategoryEntity cat);

	void updateCategories(CategoryEntity cat);
	Iterable<CategoryEntity> findAll1();
	
}
