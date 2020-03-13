package com.cts.bas.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.bas.entity.OrdersEntity;
import com.cts.bas.model.Orders;
@Repository
public interface OrdersRepository extends CrudRepository<OrdersEntity, Integer> {

	Optional<Orders> findById(int orderId);
	
}
