package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.model.Customer;
import com.hcl.service.CustomerService;

@Controller
@RequestMapping("/bank")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> createAccount(@RequestBody Customer customer){
		return new ResponseEntity<>(customerService.createCustomer(customer), HttpStatus.CREATED);
	}
	
	@PostMapping("/customer/{custId}")
	public ResponseEntity<Customer> findByCustomerId(@PathVariable int custId){
		return new ResponseEntity<>(customerService.findByCustomerId(custId), HttpStatus.CREATED);
	}
}
