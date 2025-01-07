package com.somle.eccang.repository;

import com.somle.eccang.model.EccangProductSku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EccangProductSkuRepository extends JpaRepository<EccangProductSku, String> {
}
