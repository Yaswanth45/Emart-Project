package com.cts.bas.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.bas.entity.ProductsEntity;
import com.cts.bas.model.Products;
@Repository
public interface ProductsRepository extends CrudRepository<ProductsEntity, Integer> {

	Optional<Products> findByProductName(String productName);
}
