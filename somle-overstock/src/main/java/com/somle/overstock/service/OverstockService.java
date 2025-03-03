package com.somle.overstock.service;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OverstockService {

    public OverstockClient client;

    @PostConstruct
    public void init() {
        client = new OverstockClient();
    }
}
