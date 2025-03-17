package com.somle.overstock.repository;


import com.somle.overstock.model.OverstockToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OverstockTokenRepository extends JpaRepository<OverstockToken, String> {
}

