package com.cts.bas.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.bas.entity.OrderDetails;


public interface OrderDetailsRepository extends CrudRepository<OrderDetails,Integer> {
	Optional<OrderDetails> findById(int id);

}
