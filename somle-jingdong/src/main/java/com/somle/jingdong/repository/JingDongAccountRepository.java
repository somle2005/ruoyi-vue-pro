package com.somle.jingdong.repository;

import com.somle.jingdong.model.JingDongAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JingDongAccountRepository extends JpaRepository<JingDongAccount, Long> {
}

