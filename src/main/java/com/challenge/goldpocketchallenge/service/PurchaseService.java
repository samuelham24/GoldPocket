package com.challenge.goldpocketchallenge.service;

import com.challenge.goldpocketchallenge.entity.Purchase;

import java.util.List;

public interface PurchaseService {
    public List<Purchase> findAllPurchase();
    public Purchase purchase(Purchase purchase, String id);
}
