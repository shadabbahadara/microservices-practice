package com.khan.service;

import java.util.List;

import com.khan.commons.model.Customer;

public interface CustomerService {
	Customer save(Customer customer);

	Customer fetchById(int id);

	List<Customer> fetchAll();

}
