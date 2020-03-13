package com.cts.bas.service;

import java.util.Optional;

import com.cts.bas.entity.OrdersEntity;
import com.cts.bas.model.Orders;

public interface OrdersService {
	Optional<Orders> findAllById(int orderId);

	Orders findById(int orderId);
	Iterable<OrdersEntity> findAll();
}
