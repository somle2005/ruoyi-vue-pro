package com.somle.gigacloud.repository;

import com.somle.gigacloud.model.GigaCloudAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GigaCloudAccountRepository extends JpaRepository<GigaCloudAccount, Long> {
}

