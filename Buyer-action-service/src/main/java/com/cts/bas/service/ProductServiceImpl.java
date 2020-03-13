package com.cts.bas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bas.model.Products;
import com.cts.bas.repo.ProductsRepository;
@Service
public class ProductServiceImpl implements ProductsService {
	
	@Autowired
	public ProductsRepository proRep;

	@Override
	public Optional<Products> findByProductName(String productName) {
		// TODO Auto-generated method stub
		return proRep.findByProductName(productName);
	}

}
