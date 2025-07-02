package com.somle.xincang.repository;


import com.somle.xincang.model.XinCangAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XinCangAccountRepository extends JpaRepository<XinCangAccount, Long> {
}

