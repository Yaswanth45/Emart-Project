package com.cts.bas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bas.model.SubCategory;
import com.cts.bas.repo.SubCategoryRepository;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{
	
	@Autowired
	public SubCategoryRepository rep;
	@Override
	public Optional<SubCategory> findBySubCategoryName(String subCategoryName) {
		return rep.findBySubCategoryName(subCategoryName);
	}
}
