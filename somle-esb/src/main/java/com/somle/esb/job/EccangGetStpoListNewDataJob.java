package com.somle.esb.job;


import com.somle.esb.model.OssData;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @className: EccangGetStpoListNewDataJob
 * @author: gumaomao
 * @date: 2025/02/28
 * @Version: 1.0
 * @description: 获取海外仓头程单(待发货)上传到数仓
 */
@Component
public class EccangGetStpoListNewDataJob extends EccangDataJob{

    @Override
    public String execute(String param) throws Exception {
        setDate(param);
        List<Object> list = eccangService.getStpoListNew().toList();
        service.send(
                OssData.builder()
                        .database(DATABASE)
                        .tableName("stpo_list_new")
                        .syncType("inc")
                        .requestTimestamp(System.currentTimeMillis())
                        .folderDate(today)
                        .content(list)
                        .headers(null)
                        .build()
        );

        return "data upload success";
    }
}

