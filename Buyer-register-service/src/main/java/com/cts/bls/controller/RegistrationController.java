package com.cts.bls.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bls.entity.Registration;
import com.cts.bls.service.RegistrationService;

@RestController
@CrossOrigin
public class RegistrationController {
	@Autowired
	public RegistrationService service;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody Registration user) {
		service.addUser(user);
	}

	@RequestMapping("/users/{id}")
	Optional<Registration> getUserByID(@PathVariable int id) {
		return service.getUserByID(id);
	}	
}
