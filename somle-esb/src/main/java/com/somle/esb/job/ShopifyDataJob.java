package com.somle.esb.job;


import com.somle.esb.model.Domain;
import com.somle.esb.service.EsbService;
import com.somle.esb.platform.shop.ShopifyShopProfileClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopifyDataJob extends DataJob{
    @Autowired
    EsbService service;

    @Autowired
    ShopifyShopProfileClient shopifyClient;

    final String DATABASE = Domain.SHOPIFY.toString();


    @Override
    public String execute(String param) throws Exception {
        setDate(param);

        throw new Exception("template data job do not execute");
    }
}