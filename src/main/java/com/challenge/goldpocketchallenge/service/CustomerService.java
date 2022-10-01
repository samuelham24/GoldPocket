package com.challenge.goldpocketchallenge.service;

import com.challenge.goldpocketchallenge.entity.Customer;

public interface CustomerService {
    public Customer findCustomerById(String id);
    public void createCustomer(Customer customer);
}
