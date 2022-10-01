package com.challenge.goldpocketchallenge.controller;

import com.challenge.goldpocketchallenge.entity.Product;
import com.challenge.goldpocketchallenge.service.ProductHistoryPriceService;
import com.challenge.goldpocketchallenge.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ProductHistoryPriceService productHistoryPriceService;

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable(name = "id") String id){
        return productService.getProductById(id);
    }
}
