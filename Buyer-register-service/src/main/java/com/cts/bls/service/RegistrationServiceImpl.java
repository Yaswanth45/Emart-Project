package com.cts.bls.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bls.entity.Registration;
import com.cts.bls.repo.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	public RegistrationRepository logRep;

	@Override
	public Registration findById(Integer userId) {
		return logRep.findById(userId).orElse(null);
	}

	
	public void addUser(Registration user) {
		logRep.save(user);
		
	}


	@Override
	public Optional<Registration> getUserByID(int id) {
		return logRep.findById(id);
	}
}
