package com.somle.overstock.service;


import com.somle.overstock.repository.OverstockTokenRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OverstockService {
    @Autowired
    OverstockTokenRepository tokenRepository;

    public OverstockClient client;

    @PostConstruct
    public void init() {
//        client = new OverstockClient(tokenRepository.findAll().get(0));
        client = new OverstockClient();
    }
}
