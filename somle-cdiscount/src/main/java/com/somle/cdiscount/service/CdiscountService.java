package com.somle.cdiscount.service;


import com.somle.cdiscount.repository.CdiscountTokenRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CdiscountService {
    @Autowired
    CdiscountTokenRepository tokenRepository;

    public CdiscountClient client;

    @PostConstruct
    public void init() {
        client = new CdiscountClient(tokenRepository.findAll().get(0));
    }
}
