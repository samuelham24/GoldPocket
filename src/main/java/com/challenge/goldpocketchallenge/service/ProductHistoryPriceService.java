package com.challenge.goldpocketchallenge.service;

import com.challenge.goldpocketchallenge.entity.ProductHistoryPrice;

import java.util.List;

public interface ProductHistoryPriceService {
    public ProductHistoryPrice logPrice(ProductHistoryPrice productHistoryPrice);
    public List<ProductHistoryPrice> findAllPrice();
    public List<ProductHistoryPrice> findAllHistoryPriceById(String productId);

}
