package com.somle.xincang.service;


import com.somle.xincang.model.GigaCloudAccount;
import com.somle.xincang.repository.GigaCloudAccountRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GigaCloudService {

    @Resource
    public GigaCloudAccountRepository accountRepository;

    public List<GigaCloudClient> clients;

    @PostConstruct
    public void init() {
        this.clients = accountRepository.findAll().stream()
            .map(GigaCloudClient::new)
            .toList();
    }


    @Scheduled(cron = "0 0,0 4 * * *")
    public void refreshAuths() {
        clients.forEach(
            client -> {
                GigaCloudAccount account = client.getAccount();
                String token = client.getToken();
                account.setToken(token);
                accountRepository.save(account);
            }
        );
    }
}
