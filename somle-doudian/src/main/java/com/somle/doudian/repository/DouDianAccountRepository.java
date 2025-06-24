package com.somle.doudian.repository;

import com.somle.doudian.model.DouDianAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DouDianAccountRepository extends JpaRepository<DouDianAccount, Long> {
}

