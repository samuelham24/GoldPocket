package com.challenge.goldpocketchallenge.repository;

import com.challenge.goldpocketchallenge.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
