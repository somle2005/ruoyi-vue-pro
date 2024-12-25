package com.somle.esb.job;

import cn.hutool.core.lang.Pair;
import com.somle.esb.model.OssData;
import com.somle.framework.common.util.date.LocalDateTimeUtils;
import com.somle.kingdee.model.*;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

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
            .map(client -> {
                // 获取采购订单列表
                List<KingdeePurRequest> purRequests = client.getPurRequest(vo);
                // 提取订单号列表
                List<String> billNos = purRequests.stream()
                    .map(KingdeePurRequest::getBillNo)
                    .toList();

                // 获取每个订单的详细信息
                List<KingdeePurRequestDetail> purRequestDetails = new ArrayList<>();
                billNos.forEach(billNo -> purRequestDetails.add(client.getPurRequestDetail(billNo)));

                // 返回一个包含订单列表和订单详细信息的 Pair
                return new Pair<>(purRequests, purRequestDetails);
            })
            .forEach(pair -> {
                long currentTimeMillis = System.currentTimeMillis();
                service.send(
                    OssData.builder()
                        .database(DATABASE)
                        .tableName("pur_request")
                        .syncType("inc")
                        .requestTimestamp(currentTimeMillis)
                        .folderDate(yesterday)
                        .content(pair.getKey())
                        .headers(null)
                        .build()
                );

                service.send(
                    OssData.builder()
                        .database(DATABASE)
                        .tableName("pur_request_detail")
                        .syncType("inc")
                        .requestTimestamp(currentTimeMillis)
                        .folderDate(yesterday)
                        .content(pair.getValue())
                        .headers(null)
                        .build()
                );
            });

        return "data upload success";
    }
}
