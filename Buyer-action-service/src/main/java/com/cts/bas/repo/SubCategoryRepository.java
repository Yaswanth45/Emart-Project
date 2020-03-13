package com.cts.bas.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.bas.entity.SubCategoryEntity;
import com.cts.bas.model.SubCategory;
@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategoryEntity, Integer> {
	Optional<SubCategory> findBySubCategoryName(String subCategoryName);
}
