package com.khan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khan.commons.model.Customer;
import com.khan.service.CustomerService;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {
	@Autowired
	private CustomerService customerService;

	@PostMapping(path = "/profile")
	@PreAuthorize("hasRole('ROLE_admin')")
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}

	@GetMapping(path = "/profiles")
	@PreAuthorize("hasRole('ROLE_admin') or hasRole('ROLE_operator')")
	public List<Customer> fetchAllProfiles() {
		return customerService.fetchAll();
	}

	@GetMapping(path = "/profiles/{id}")
	@PreAuthorize("hasRole('ROLE_admin') or hasRole('ROLE_operator')")
	public Customer fetchProfile(@PathVariable int id) {
		return customerService.fetchById(id);
	}
}
