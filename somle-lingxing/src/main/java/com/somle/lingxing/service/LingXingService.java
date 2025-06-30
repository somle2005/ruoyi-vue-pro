package com.somle.lingxing.service;


import com.somle.lingxing.repository.LingXingAccountRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class LingXingService {

    @Resource
    public LingXingAccountRepository accountRepository;

    public List<LingXingClient> clients;

    @PostConstruct
    public void init() {
        this.clients = accountRepository.findAll().stream()
            .map(LingXingClient::new)
            .toList();
    }
}
