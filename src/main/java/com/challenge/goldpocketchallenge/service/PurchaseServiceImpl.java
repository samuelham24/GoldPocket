package com.challenge.goldpocketchallenge.service;

import com.challenge.goldpocketchallenge.entity.Customer;
import com.challenge.goldpocketchallenge.entity.Pocket;
import com.challenge.goldpocketchallenge.entity.Purchase;
import com.challenge.goldpocketchallenge.entity.PurchaseDetail;
import com.challenge.goldpocketchallenge.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    PurchaseRepository purchaseRepository;

    @Autowired
    CustomerService customerService;

    @Autowired
    PocketService pocketService;

    @Override
    public List<Purchase> findAllPurchase() {
        return purchaseRepository.findAll();
    }

    @Override
    public Purchase purchase(Purchase purchase, String id) {
        Customer customer = customerService.findCustomerById(id);
        purchase.setCustomer(customer);
        purchase.setPurchaseDate(new Date());

        if(purchase.getPurchaseType()==1){
            for (PurchaseDetail purchaseDetail: purchase.getPurchaseDetails()){
                Pocket pocket = pocketService.findPocketById(purchaseDetail.getPocket().getId());
                pocketService.topUp(pocket, purchaseDetail.getQuantityInGram());
                purchaseDetail.setProduct(pocket.getProduct());
                purchaseDetail.setPrice(pocket.getProduct().getPriceBuy());
                purchaseDetail.setPurchase(purchase);
            }
        }

        else if(purchase.getPurchaseType()==0){
            for (PurchaseDetail purchaseDetail: purchase.getPurchaseDetails()){
                Pocket pocket = pocketService.findPocketById(purchaseDetail.getPocket().getId());
                pocketService.topUp(pocket, purchaseDetail.getQuantityInGram());
                purchaseDetail.setProduct(pocket.getProduct());
                purchaseDetail.setPrice(pocket.getProduct().getPriceSell());
                purchaseDetail.setPurchase(purchase);
            }
        }
        return purchaseRepository.save(purchase);
    }


}
