package com.challenge.goldpocketchallenge.repository;

import com.challenge.goldpocketchallenge.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, String> {
}
