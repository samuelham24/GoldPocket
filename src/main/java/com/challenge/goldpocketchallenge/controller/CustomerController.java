package com.challenge.goldpocketchallenge.controller;

import com.challenge.goldpocketchallenge.entity.Customer;
import com.challenge.goldpocketchallenge.entity.Pocket;
import com.challenge.goldpocketchallenge.service.CustomerService;
import com.challenge.goldpocketchallenge.service.PocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    PocketService pocketService;

    @PostMapping("/customer")
    public void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }

    @GetMapping("/customer/{id}")
    public Customer findCustomerById(@PathVariable(name = "id") String id){
        return customerService.findCustomerById(id);
    }

    @GetMapping("/customer/{id}/pockets")
    public List<Pocket> getCustomerPocket(@PathVariable(name = "id") String id){
        return pocketService.findAllPocketsById(id);
    }
}
