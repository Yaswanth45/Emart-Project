package com.cts.bls.service;

import java.util.Optional;

import com.cts.bls.entity.Registration;

public interface RegistrationService {
	
	Registration findById(Integer userId);
	void addUser(Registration user);
	Optional<Registration> getUserByID(int id);
}
