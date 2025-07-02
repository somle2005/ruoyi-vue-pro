package com.somle.xincang.repository;

import com.somle.xincang.model.GigaCloudAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GigaCloudAccountRepository extends JpaRepository<GigaCloudAccount, Long> {
}

