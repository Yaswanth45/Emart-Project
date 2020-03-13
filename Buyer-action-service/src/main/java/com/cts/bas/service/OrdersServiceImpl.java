package com.cts.bas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bas.entity.OrdersEntity;
import com.cts.bas.model.Orders;
import com.cts.bas.repo.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	public OrdersRepository rep;
	
	@Override
	public Iterable<OrdersEntity> findAll() {
		return rep.findAll();
	}

	@Override
	public Optional<Orders> findAllById(int orderId) {
		return rep.findById(orderId);
	}

	@Override
	public Orders findById(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
