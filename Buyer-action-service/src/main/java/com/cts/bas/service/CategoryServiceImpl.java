package com.cts.bas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bas.entity.CategoryEntity;
import com.cts.bas.model.Category;
import com.cts.bas.repo.CategoryRepository;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	public CategoryRepository catRep;

	@Override
	public Optional<Category> findByCategoryName(String categoryName) {
		return catRep.findByCategoryName(categoryName);
	}

	@Override
	public Iterable<CategoryEntity> findAll1() {
		return catRep.findAll();
	}
}