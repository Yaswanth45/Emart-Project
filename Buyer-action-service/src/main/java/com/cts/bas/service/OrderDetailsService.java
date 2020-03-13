package com.cts.bas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bas.entity.OrderDetails;

import com.cts.bas.repo.OrderDetailsRepository;

@Service
public class OrderDetailsService {
	@Autowired
	OrderDetailsRepository repo;
	public List<OrderDetails> getAllDetails() {
		// TODO Auto-generated method stub
		return (List<OrderDetails>) repo.findAll();
	}
	public OrderDetails findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
