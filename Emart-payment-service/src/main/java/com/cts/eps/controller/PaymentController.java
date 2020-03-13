package com.cts.eps.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.eps.entity.Payment;
import com.cts.eps.service.PaymentService;

@RestController
@CrossOrigin
public class PaymentController {
	
	@Autowired
	PaymentService service;

	@RequestMapping(method = RequestMethod.POST, value = "/payments")
	void addPayment(@RequestBody Payment payment) {
		service.addPayment(payment);
	}
	
	@RequestMapping("/payments/{id}")
	Optional<Payment> getUserDetailsById(@PathVariable(name="payId") int id) {
		return service.findById(id);
	}
}
