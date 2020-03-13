package com.cts.bas.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.bas.entity.CategoryEntity;
import com.cts.bas.model.Category;
@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity , Integer> {

	Optional<Category> findByCategoryName(String categoryName);
}
