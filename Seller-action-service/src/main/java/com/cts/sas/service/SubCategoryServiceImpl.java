package com.cts.sas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.sas.entity.SubCategoryEntity;
import com.cts.sas.model.SubCategory;
import com.cts.sas.repo.SubCategoryRepository;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{
	
	@Autowired
	public SubCategoryRepository rep;
	@Override
	public Optional<SubCategory> findBySubCategoryName(String subCategoryName) {
		return rep.findBySubCategoryName(subCategoryName);
	}
	@Override
	public void addSubCategories(SubCategoryEntity subc) {
		rep.save(subc);
		
	}
	@Override
	public void updateSubCategories(SubCategoryEntity subc) {
		rep.save(subc);
		
	}
}
