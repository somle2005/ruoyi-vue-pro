package com.somle.overstock.repository;


import com.somle.overstock.model.OverstockAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OverstockAccountRepository extends JpaRepository<OverstockAccount, Long> {
}

