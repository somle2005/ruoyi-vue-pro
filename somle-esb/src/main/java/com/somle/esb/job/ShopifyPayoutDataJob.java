package com.somle.esb.job;


import com.somle.esb.model.OssData;
import com.somle.shopify.service.ShopifyClient;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ShopifyPayoutDataJob extends ShopifyDataJob {

    @Resource
    ShopifyClient shopifyClient;

    @Override
    public String execute(String param) throws Exception {
        setDate(param);

        var result = shopifyClient.getPayouts("Shopify_FIT_USA");
        var data = OssData.builder()
            .database(DATABASE)
            .tableName("payout")
            .syncType("inc")
            .requestTimestamp(System.currentTimeMillis())
            .folderDate(beforeYesterday)
            .content(result)
            .headers(null)
            .build();
        service.send(data);

        return "data upload success";
    }
}