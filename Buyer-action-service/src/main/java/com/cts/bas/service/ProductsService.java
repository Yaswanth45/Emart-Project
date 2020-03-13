package com.cts.bas.service;

import java.util.Optional;

import com.cts.bas.model.Products;

public interface ProductsService {
	Optional<Products> findByProductName(String productName);
}
