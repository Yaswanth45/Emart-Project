package com.cts.sas.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.sas.entity.ProductsEntity;
import com.cts.sas.model.Products;
@Repository
public interface ProductsRepository extends CrudRepository<ProductsEntity, Integer> {

	Optional<Products> findByProductName(String productName);
}
