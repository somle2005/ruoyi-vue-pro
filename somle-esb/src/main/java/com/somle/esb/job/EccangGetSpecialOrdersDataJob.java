package com.somle.esb.job;


import com.alibaba.fastjson.JSONObject;
import com.somle.esb.model.OssData;
import org.springframework.stereotype.Component;


/**
 * @className: EccangGetSpecialOrdersListDataJob
 * @author: gumaomao
 * @date: 2025/03/03
 * @Version: 1.0
 * @description: 易仓WMS获取退件列表
 */
@Component
public class EccangGetSpecialOrdersDataJob extends EccangDataJob{

    @Override
    public String execute(String param) throws Exception {
        setDate(param);
        JSONObject specialOrdersList = eccangWMSService.getSpecialOrdersList();
        service.send(
                OssData.builder()
                        .database(DATABASE)
                        .tableName("special_orders")
                        .syncType("full")
                        .requestTimestamp(System.currentTimeMillis())
                        .folderDate(today)
                        .content(specialOrdersList)
                        .headers(null)
                        .build()
        );
        return "data upload success";
    }
}
