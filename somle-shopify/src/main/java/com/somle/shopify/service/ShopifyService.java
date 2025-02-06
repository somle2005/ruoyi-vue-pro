package com.somle.shopify.service;

import com.somle.framework.common.util.collection.CollectionUtils;
import com.somle.shopify.model.ShopifyToken;
import com.somle.shopify.repository.ShopifyTokenRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ShopifyService {

    @Autowired
    ShopifyTokenRepository tokenRepository;

    private ShopifyClient client;



    /**
    * @Author Wqh
    * @Description 获取客户端对象
    * @Date 15:50 2025/2/6
    * @Param []
    * @return com.somle.shopify.service.ShopifyClient
    **/

    public ShopifyClient client() {

        if(client!=null) {
            return client;
        }

        List<ShopifyToken> tokenList = tokenRepository.findAll();
        if(CollectionUtils.isEmpty(tokenList)) {
            throw new RuntimeException("缺少 Shopify Token 配置");
        } else {
            client = new ShopifyClient(tokenList.get(0));
        }

        return client;
    }


}
