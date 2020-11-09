package com.khan.service;

import java.util.List;

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

	@Override
	public Customer fetchById(int id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public List<Customer> fetchAll() {
		return customerRepository.findAll();
	}

}
