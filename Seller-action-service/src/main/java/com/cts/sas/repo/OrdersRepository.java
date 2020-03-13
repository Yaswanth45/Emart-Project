package com.cts.sas.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.sas.entity.OrdersEntity;
import com.cts.sas.model.Orders;
@Repository
public interface OrdersRepository extends CrudRepository<OrdersEntity, Integer> {

	Optional<Orders> findById(int orderId);
	
}
