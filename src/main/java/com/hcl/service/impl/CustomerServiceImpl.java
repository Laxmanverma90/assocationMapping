package com.hcl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Customer;
import com.hcl.repository.CustomerRepository;
import com.hcl.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository custRepo;
	
	@Override
	public Customer createCustomer(Customer customer) {
		return custRepo.save(customer);
	}

	@Override
	public Customer findByCustomerId(int custId) {
		return custRepo.getOne(custId);
	}

}
