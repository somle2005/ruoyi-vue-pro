package com.somle.wangdian.service;

import com.somle.wangdian.repository.WangdianTokenRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class WangdianService {
    @Autowired
    WangdianTokenRepository tokenRepository;

    public List<WdtClient> clients;

    @PostConstruct
    public void init() {
        clients = tokenRepository.findAll().stream().map(t -> new WdtClient(t.getSid(),t.getAppkey(),t.getAppsecret())).toList();
    }
}
