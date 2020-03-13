package com.cts.sas.service;

import java.util.Optional;

import com.cts.sas.entity.ProductsEntity;
import com.cts.sas.model.Products;

public interface ProductsService {
	Optional<Products> findByProductName(String productName);

	void addProducts(ProductsEntity pro);
	Iterable<ProductsEntity> findAll2();

	
}
