package com.challenge.goldpocketchallenge.service;

import com.challenge.goldpocketchallenge.entity.Customer;
import com.challenge.goldpocketchallenge.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer findCustomerById(String id) {
        Customer customer = customerRepository.findById(id).get();
        return customer;
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
