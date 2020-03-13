package com.cts.sas.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.sas.entity.CategoryEntity;
import com.cts.sas.model.Category;
@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity , Integer> {

	Optional<Category> findByCategoryName(String categoryName);

}
