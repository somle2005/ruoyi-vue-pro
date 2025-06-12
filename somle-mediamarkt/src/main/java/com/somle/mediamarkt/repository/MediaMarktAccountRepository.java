package com.somle.mediamarkt.repository;

import com.somle.mediamarkt.model.pojo.MediaMarktAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaMarktAccountRepository extends JpaRepository<MediaMarktAccount, Long> {
}
