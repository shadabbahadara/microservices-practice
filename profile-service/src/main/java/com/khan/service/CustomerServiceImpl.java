package com.khan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khan.commons.model.Customer;
import com.khan.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

}
