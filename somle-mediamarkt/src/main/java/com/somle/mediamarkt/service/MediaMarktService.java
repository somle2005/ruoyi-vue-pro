package com.somle.mediamarkt.service;

import com.somle.mediamarkt.repository.MediaMarktAccountRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaMarktService {
    public List<MediaMarktClient> clients;
    @Resource
    private MediaMarktAccountRepository mediaMarktAccountRepository;

    @PostConstruct
    private void init() {
        clients = mediaMarktAccountRepository.findAll().stream()
            .map(MediaMarktClient::new)
            .toList();
    }


}
