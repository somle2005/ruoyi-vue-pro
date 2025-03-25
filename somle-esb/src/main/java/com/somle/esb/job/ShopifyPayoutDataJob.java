package com.somle.esb.job;


import com.somle.esb.model.OssData;
import com.somle.shopify.service.ShopifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopifyPayoutDataJob extends ShopifyDataJob {

    @Autowired(required = false)
    ShopifyService shopifyService;

    @Override
    public String execute(String param) throws Exception {
        setDate(param);
        var result = shopifyService.getClient(1L).getPayouts();
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