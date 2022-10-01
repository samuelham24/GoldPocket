package com.challenge.goldpocketchallenge.service;

import com.challenge.goldpocketchallenge.entity.Customer;
import com.challenge.goldpocketchallenge.entity.Pocket;
import com.challenge.goldpocketchallenge.repository.PocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PocketServiceImpl implements PocketService{

    @Autowired
    PocketRepository pocketRepository;

    @Autowired
    CustomerService customerService;


    @Override
    public void createNewPocket(Pocket pocket) {
        pocketRepository.save(pocket);
    }

    @Override
    public Pocket findPocketById(String id) {
        Pocket pocket = pocketRepository.findById(id).get();
        return pocket;
    }

    @Override
    public List<Pocket> findAllPocketsById(String id) {
        Customer customer = customerService.findCustomerById(id);
        return customer.getPockets();
    }

    @Override
    public void topUp(Pocket pocket, Double qty) {
        pocket.setPocketQty(pocket.getPocketQty() + qty);
        pocketRepository.save(pocket);
    }

    @Override
    public void sell(Pocket pocket, Double qty) {
        pocket.setPocketQty(pocket.getPocketQty() - qty);
        pocketRepository.save(pocket);
    }
}
