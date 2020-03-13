package com.cts.eps.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.eps.entity.Payment;
@Repository
public interface PaymentRepository extends CrudRepository<Payment,Integer>{
	Optional<Payment> findById(int payId);
}
