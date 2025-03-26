package com.somle.walmart.repository;

import com.somle.walmart.model.WalmartToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface WalmartTokenRepository extends JpaRepository<WalmartToken, Long> {

    WalmartToken findByShopName(String shopName);
}

