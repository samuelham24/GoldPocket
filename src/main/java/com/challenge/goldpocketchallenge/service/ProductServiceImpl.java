package com.challenge.goldpocketchallenge.service;

import com.challenge.goldpocketchallenge.entity.Product;
import com.challenge.goldpocketchallenge.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id).get();
    }
}
