package com.somle.overstock.service;


import com.somle.overstock.repository.OverstockAccountRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OverstockService {

    @Resource
    public OverstockAccountRepository accountRepository;

    public List<OverstockClient> clients;

    @PostConstruct
    public void init() {
        this.clients = accountRepository.findAll().stream()
            .map(OverstockClient::new)
            .toList();
    }
}
