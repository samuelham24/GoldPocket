package com.challenge.goldpocketchallenge.repository;

import com.challenge.goldpocketchallenge.entity.Pocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PocketRepository extends JpaRepository<Pocket, String>, JpaSpecificationExecutor<Pocket> {
}
