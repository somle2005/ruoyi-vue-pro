package com.somle.esb.job;


import com.somle.esb.model.OssData;
import com.somle.walmart.domain.WalmartOrderReqVO;
import com.somle.walmart.service.WalmartClient;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class WalmartOrderDataJob extends WalmartDataJob {

    @Resource
    private WalmartClient walmartClient;

    @Override
    public String execute(String param) throws Exception {
        setDate(param);

        var vo = WalmartOrderReqVO.builder()
                .createdStartDate(yesterdayFirstSecond)
                .createdEndDate(yesterdayLastSecond)
                .shopName("Walmart_FIT_USA")
                .build();
        var result = walmartClient.getOrders(vo);
        var data = OssData.builder()
                .database(DATABASE)
                .tableName("order")
                .syncType("inc")
                .requestTimestamp(System.currentTimeMillis())
                .folderDate(yesterday)
                .content(result)
                .headers(null)
                .build();
        service.send(data);

        return "data upload success";
    }
}