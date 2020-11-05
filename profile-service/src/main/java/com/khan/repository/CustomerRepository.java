package com.khan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khan.commons.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
