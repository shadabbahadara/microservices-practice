package com.khan.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
}
