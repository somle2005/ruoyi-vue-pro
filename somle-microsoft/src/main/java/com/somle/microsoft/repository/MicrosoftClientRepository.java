package com.somle.microsoft.repository;

import com.somle.microsoft.model.MicrosoftClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicrosoftClientRepository extends JpaRepository<MicrosoftClient, String> {
}
