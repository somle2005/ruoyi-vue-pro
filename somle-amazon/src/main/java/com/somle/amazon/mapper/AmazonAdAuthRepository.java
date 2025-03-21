package com.somle.amazon.mapper;

import com.somle.amazon.model.AmazonAdAuthDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AmazonAdAuthRepository extends JpaRepository<AmazonAdAuthDO, Long> {
}
