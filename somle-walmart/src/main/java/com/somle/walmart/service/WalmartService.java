package com.somle.walmart.service;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.walmart.domain.WalmartToken;
import com.somle.walmart.mapper.WalmartTokenMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class WalmartService {

    @Autowired
    private WalmartTokenMapper walmartTokenMapper;


    private WalmartClient client;

    public WalmartClient getClient() {
        if (client == null) {
            LambdaQueryWrapper<WalmartToken> wrapper = new LambdaQueryWrapper<>();
            var token = walmartTokenMapper.selectList(wrapper).get(0);
            if (token.getSvcName().equals("Walmart Marketplace")) {
                client = new WalmartMarketplaceClient(token);
            } else {
                client = new WalmartDsvClient(token, "752076");
            }
        }
        return client;
    }


    public WalmartClient getClient(WalmartToken token) {
        if (client == null) {
            if (token.getSvcName().equals("Walmart Marketplace")) {
                client = new WalmartMarketplaceClient(token);
            } else {
                client = new WalmartDsvClient(token, "752076");
            }
        }
        return client;
    }

}