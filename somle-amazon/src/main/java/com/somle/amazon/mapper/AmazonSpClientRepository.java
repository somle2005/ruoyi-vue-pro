package com.somle.amazon.mapper;

import com.somle.amazon.model.AmazonSpClientDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AmazonSpClientRepository extends JpaRepository<AmazonSpClientDO, String> {
}
