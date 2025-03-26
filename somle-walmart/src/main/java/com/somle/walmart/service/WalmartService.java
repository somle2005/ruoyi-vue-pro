package com.somle.walmart.service;


import cn.iocoder.yudao.framework.common.util.string.StrUtils;
import com.somle.walmart.model.WalmartToken;
import com.somle.walmart.repository.WalmartTokenRepository;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class WalmartService {

    @Autowired
    private WalmartTokenRepository tokenRepository;


    private WalmartClient client;

    public WalmartClient getClient(Long tokenId) {
        if (tokenId == null) {
            throw new RuntimeException("WalmartId不能为空");
        }
        if (client == null) {
            WalmartToken walmartToken = tokenRepository.findById(tokenId).get();
            if (walmartToken.getSvcName().equals("Walmart Marketplace")) {
                client = new WalmartMarketplaceClient(walmartToken);
            } else {
                client = new WalmartDsvClient(walmartToken, walmartToken.getShipNode());
            }
        }
        return client;
    }

}