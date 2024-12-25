package com.somle.esb.job;

import com.somle.esb.model.OssData;
import com.somle.framework.common.util.date.LocalDateTimeUtils;
import com.somle.kingdee.model.KingdeePurOrderReqVO;
import com.somle.kingdee.model.KingdeePurRequestReqVO;
import org.springframework.stereotype.Component;

/**
 * @author: Wqh
 * @date: 2024/12/25 11:04
 */
@Component
public class KingdeePurRequestDataJob extends KingdeeDataJob {
    @Override
    public String execute(String param) throws Exception {
        setDate(param);
        var vo = KingdeePurRequestReqVO.builder()
            .createStartTime(LocalDateTimeUtils.toTimestamp(yesterdayFirstSecond))
            .createEndTime(LocalDateTimeUtils.toTimestamp(yesterdayLastSecond))
            .build();

        kingdeeService.getClientList().stream()
            .map(client -> client.getPurRequest(vo))
            .forEach(response -> {
                service.send(
                    OssData.builder()
                        .database(DATABASE)
                        .tableName("pur_request")
                        .syncType("inc")
                        .requestTimestamp(System.currentTimeMillis())
                        .folderDate(yesterday)
                        .content(response)
                        .headers(null)
                        .build()
                );
            });

        return "data upload success";
    }
}
