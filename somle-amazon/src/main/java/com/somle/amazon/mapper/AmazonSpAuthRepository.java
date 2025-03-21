package com.somle.amazon.mapper;

import com.somle.amazon.model.AmazonSpAuthDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AmazonSpAuthRepository extends JpaRepository<AmazonSpAuthDO, Long> {
}
