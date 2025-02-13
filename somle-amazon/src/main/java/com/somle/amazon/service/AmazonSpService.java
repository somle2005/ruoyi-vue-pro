package com.somle.amazon.service;

import cn.iocoder.yudao.framework.common.util.config.Variable;
import com.somle.amazon.model.enums.AmazonRegion;
import com.somle.amazon.repository.AmazonAdAuthRepository;
import com.somle.amazon.repository.AmazonAdClientRepository;
import com.somle.amazon.repository.AmazonSpAuthRepository;
import com.somle.amazon.repository.AmazonSpClientRepository;
import com.somle.framework.common.util.collection.StreamX;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AmazonSpService {
    @Resource
    AmazonService amazonService;

    @Resource
    AmazonSpAuthRepository authRepository;

    @Resource
    AmazonSpClientRepository clientRepository;

    private List<AmazonSpClient> clients;

    public List<AmazonSpClient> getClients() {
        return clients;
    }

    public AmazonSpClient getClient(AmazonRegion region) {
        return StreamX.from(clients).filter(c -> c.getAuth().getRegionCode().equals(region.getCode())).first();
    }

    @PostConstruct
    public void init() {
        clients = authRepository.findAll().stream()
            .map(AmazonSpClient::new)
            .toList();
        // 启动后刷新 Token
        refreshAuth();
    }

    private Variable isAuthRefreshed = new Variable(null, 1000 * 60 * 30, Variable.ExpireType.LIVE);

    @Scheduled(cron = "0 0,30 * * * *")
    public Boolean refreshAuth() {
        if(isAuthRefreshed.getValue()!= null) {
            log.info("请勿频繁刷新 Amazon Token");
            return false;
        }

        clients.stream()
            .forEach(client -> {
                var auth = client.getAuth();
                var newAccessToken = amazonService.refreshAccessToken(
                    auth.getClientId(),
                    clientRepository.findById(auth.getClientId()).get().getSecret(),
                    auth.getRefreshToken()
                );
                auth.setAccessToken(newAccessToken);
                client.setAuth(auth);
                authRepository.save(auth);
            });

        isAuthRefreshed.setValue(true);

        return true;
    }

}
