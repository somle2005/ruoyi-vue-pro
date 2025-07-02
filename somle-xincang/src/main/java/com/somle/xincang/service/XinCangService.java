package com.somle.xincang.service;


import com.somle.xincang.model.XinCangAccount;
import com.somle.xincang.repository.XinCangAccountRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class XinCangService {

    @Resource
    public XinCangAccountRepository accountRepository;

    public List<XinCangClient> clients;

    @PostConstruct
    public void init() {
        this.clients = accountRepository.findAll().stream()
            .map(XinCangClient::new)
            .toList();
    }


    @Scheduled(cron = "0 0,59 * * * *")
    public void refreshAuths() {
        clients.forEach(
            client -> {
                XinCangAccount account = client.getAccount();
                String token = client.getToken();
                account.setToken(token);
                accountRepository.save(account);
            }
        );
    }
}
