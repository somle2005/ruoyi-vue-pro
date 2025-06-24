package com.somle.xiaohongshu.service;

import com.somle.xiaohongshu.model.reps.LazadaRefreshTokenResp;
import com.somle.xiaohongshu.repository.XiaoHongShuAccountRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class XiaoHongShuService {

    public List<XiaoHongShuClient> clients;

    @Resource
    XiaoHongShuAccountRepository xiaoHongShuAccountRepository;

    @PostConstruct
    public void init() {
        this.clients = xiaoHongShuAccountRepository.findAll().stream()
            .map(XiaoHongShuClient::new)
            .toList();
    }


//    @Scheduled(cron = "0 0,30 * * * *")
//    public void refreshAuths() {
//        clients.forEach(client -> {
//            LazadaRefreshTokenResp lazadaRefreshTokenResp = client.refreshToken();
//            LazadaAccount lazadaAccount = client.getLazadaAccount();
//            lazadaAccount.setAccessToken(lazadaRefreshTokenResp.getAccessToken());
//            client.setLazadaAccount(lazadaAccount);
//            lazadaAccountRepository.save(lazadaAccount);
//        });
//    }
}