package com.somle.esb.job;


import com.somle.esb.model.OssData;
import com.somle.walmart.service.WalmartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WalmartReconReportDataJob extends WalmartDataJob {

    @Autowired(required = false)
    private WalmartService walmartService;

    @Override
    public String execute(String param) throws Exception {
        setDate(param);

        var result = walmartService.getClient(1L).getReconFile(yesterday);
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