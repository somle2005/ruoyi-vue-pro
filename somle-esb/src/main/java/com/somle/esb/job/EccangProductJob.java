package com.somle.esb.job;

import com.somle.esb.model.OssData;
import org.springframework.stereotype.Component;

/**
 * @className: EccangProductJob
 * @author: Wqh
 * @date: 2024/10/22 11:27
 * @Version: 1.0
 */
@Component
public class EccangProductJob extends EccangDataJob{
    @Override
    public String execute(String param) throws Exception {
        setDate(param);

        eccangService.getProducts()
                .forEach(page -> {
                    OssData data = OssData.builder()
                            .database(DATABASE)
                            .tableName("product")
                            .syncType("full")
                            .requestTimestamp(System.currentTimeMillis())
                            .folderDate(today)
                            .content(page)
                            .headers(null)
                            .build();
                    service.send(data);
                });

        return "data upload success";
    }
}
