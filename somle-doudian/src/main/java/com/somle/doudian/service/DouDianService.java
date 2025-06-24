package com.somle.doudian.service;

import com.doudian.open.core.AccessToken;
import com.doudian.open.utils.JsonUtil;
import com.somle.doudian.model.DouDianAccount;
import com.somle.doudian.repository.DouDianAccountRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DouDianService {

    public List<DouDianClient> clients;

    @Resource
    DouDianAccountRepository douDianAccountRepository;

    @PostConstruct
    public void init() {
        this.clients = douDianAccountRepository.findAll().stream()
            .map(DouDianClient::new)
            .toList();
    }


    @Scheduled(cron = "0 0 0 */6 * *")
    public void refreshAuths() {
        clients.forEach(client -> {
            AccessToken token = client.createToken();
            DouDianAccount douDianAccount = client.getDouDianAccount();
            douDianAccount.setAccessToken(token.getAccessToken());
            douDianAccount.setRefreshToken(token.getRefreshToken());
            douDianAccount.setAccessTokenJson(JsonUtil.toJson(token));
            client.setDouDianAccount(douDianAccount);
            douDianAccountRepository.save(douDianAccount);
        });
    }
}