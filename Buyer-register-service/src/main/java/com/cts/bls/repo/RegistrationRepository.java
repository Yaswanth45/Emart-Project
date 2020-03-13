package com.cts.bls.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.bls.entity.Registration;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Integer> {
	Optional<Registration> findById(Integer userId);
}
