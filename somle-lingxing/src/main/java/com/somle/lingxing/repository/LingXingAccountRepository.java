package com.somle.lingxing.repository;


import com.somle.lingxing.model.LingXingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LingXingAccountRepository extends JpaRepository<LingXingAccount, Long> {
}

