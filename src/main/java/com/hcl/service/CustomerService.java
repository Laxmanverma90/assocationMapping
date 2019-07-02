package com.hcl.service;

import com.hcl.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	Customer findByCustomerId(int custId);

}
