package com.challenge.goldpocketchallenge.controller;

import com.challenge.goldpocketchallenge.entity.ProductHistoryPrice;
import com.challenge.goldpocketchallenge.service.ProductHistoryPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductHistoryPriceController {

    @Autowired
    ProductHistoryPriceService productHistoryPriceService;

    @GetMapping("/history")
    public List<ProductHistoryPrice> findALlHistoryProduct(){
        return productHistoryPriceService.findAllPrice();
    }
}
