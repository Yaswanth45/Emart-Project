package com.cts.sas.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.sas.entity.SubCategoryEntity;
import com.cts.sas.model.SubCategory;
@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategoryEntity, Integer> {
	Optional<SubCategory> findBySubCategoryName(String subCategoryName);
}
