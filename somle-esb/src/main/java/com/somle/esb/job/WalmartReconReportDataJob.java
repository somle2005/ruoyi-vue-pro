package com.somle.esb.job;


import com.somle.esb.model.OssData;
import com.somle.walmart.service.WalmartClient;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class WalmartReconReportDataJob extends WalmartDataJob {

    @Resource
    private WalmartClient walmartClient;

    @Override
    public String execute(String param) throws Exception {
        setDate(param);

        var result = walmartClient.getReconFile(yesterday,"Walmart_FIT_USA");
        var data = OssData.builder()
                .database(DATABASE)
                .tableName("recon_report")
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