package com.cts.sas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.sas.entity.CategoryEntity;
import com.cts.sas.model.Category;
import com.cts.sas.repo.CategoryRepository;
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
	@Override
	public void addCategories(CategoryEntity cat) {
		catRep.save(cat);
		
	}

	@Override
	public void updateCategories(CategoryEntity cat) {
		catRep.save(cat);
		
	}
}