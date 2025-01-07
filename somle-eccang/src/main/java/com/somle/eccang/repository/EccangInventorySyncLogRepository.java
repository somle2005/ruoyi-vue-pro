package com.somle.eccang.repository;

import com.somle.eccang.model.SyncLog.EccangInventorySyncLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EccangInventorySyncLogRepository extends JpaRepository<EccangInventorySyncLog,Long> {


    Optional<EccangInventorySyncLog> findFirstByEndPointAndIsCompletedOrderByRequestTime(String endPoint, Boolean isCompleted);
}
