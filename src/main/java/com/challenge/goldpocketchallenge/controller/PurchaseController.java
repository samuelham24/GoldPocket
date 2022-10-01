package com.challenge.goldpocketchallenge.controller;

import com.challenge.goldpocketchallenge.entity.Purchase;
import com.challenge.goldpocketchallenge.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @GetMapping("/purchases")
    public List<Purchase> searchPurchase(){
        return purchaseService.findAllPurchase();
    }

    @PostMapping("/purchase")
    public Purchase purchase(Purchase purchase, String id){
        return purchaseService.purchase(purchase, id);
    }

}
