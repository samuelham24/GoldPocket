package com.challenge.goldpocketchallenge.service;

import com.challenge.goldpocketchallenge.entity.Product;
import com.challenge.goldpocketchallenge.entity.ProductHistoryPrice;
import com.challenge.goldpocketchallenge.repository.ProductHistoryPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductHistoryPriceImpl implements ProductHistoryPriceService{

    @Autowired
    ProductHistoryPriceRepository productHistoryPriceRepository;

    @Autowired
    ProductService productService;

    @Override
    public ProductHistoryPrice logPrice(ProductHistoryPrice productHistoryPrice) {
        return productHistoryPriceRepository.save(productHistoryPrice);
    }

    @Override
    public List<ProductHistoryPrice> findAllPrice() {
        return productHistoryPriceRepository.findAll();
    }

    @Override
    public List<ProductHistoryPrice> findAllHistoryPriceById(String productId) {
        Product product = productService.getProductById(productId);
        return product.getHistoryPrices();
    }
}
