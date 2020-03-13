package com.cts.sas.service;

import java.util.Optional;

import com.cts.sas.entity.OrdersEntity;
import com.cts.sas.model.Orders;

public interface OrdersService {
	Optional<Orders> findAllById(int orderId);

	Orders findById(int orderId);
	Iterable<OrdersEntity> findAll();
}
