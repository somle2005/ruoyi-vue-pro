package com.somle.jingdong.service;

import com.somle.jingdong.repository.JingDongAccountRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class JingDongService {
    public List<JingDongClient> jingDongClients;
    @Resource
    JingDongAccountRepository jingDongAccountRepository;

    @PostConstruct
    public void init() {
        this.jingDongClients = jingDongAccountRepository.findAll().stream()
            .map(JingDongClient::new)
            .toList();
    }

//    @Scheduled(cron = "0 0,0 1 * * *")
//    public void refreshAccessToken() {
//        tikTokClients.stream().forEach(client -> {
//            TikTokAccount tikTokAccount = client.getTikTokAccount();
//            TikTokAuthResp tikTokAuthResp = client.getAccessToken(tikTokAccount);
//            tikTokAccount.setAccessToken(tikTokAuthResp.getData().getAccessToken());
//            client.setTikTokAccount(tikTokAccount);
//            tikTokAccountRepository.save(tikTokAccount);
//        });
//    }
}
