package com.cts.eps.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.eps.entity.Payment;
import com.cts.eps.repo.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository repo;
	

	public void addPayment(Payment payment) {
		repo.save(payment);
		
	}

	public Optional<Payment> findById(int payId) {
		
		return repo.findById(payId);
	}

}
