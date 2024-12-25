package com.somle.esb.job;


import cn.hutool.core.lang.Pair;
import com.somle.esb.model.OssData;
import com.somle.framework.common.util.date.LocalDateTimeUtils;
import com.somle.kingdee.model.KingdeePurOrder;
import com.somle.kingdee.model.KingdeePurOrderDetail;
import com.somle.kingdee.model.KingdeePurOrderReqVO;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class KingdeePurOrderDataJob extends KingdeeDataJob {


    @Override
    public String execute(String param) throws Exception {
        // 设置日期参数
        setDate(param);

        // 构建请求对象
        var vo = KingdeePurOrderReqVO.builder()
            .createStartTime(LocalDateTimeUtils.toTimestamp(yesterdayFirstSecond))
            .createEndTime(LocalDateTimeUtils.toTimestamp(yesterdayLastSecond))
            .build();

        // 获取所有客户端并处理每个客户端的数据
        kingdeeService.getClientList().stream()
            .map(client -> {
                // 获取采购订单列表
                List<KingdeePurOrder> purOrders = client.getPurOrder(vo);
                // 提取订单号列表
                List<String> billNos = purOrders.stream()
                    .map(KingdeePurOrder::getBillNo)
                    .toList();

                // 获取每个订单的详细信息
                List<KingdeePurOrderDetail> purOrderDetails = new ArrayList<>();
                billNos.forEach(billNo -> purOrderDetails.add(client.getPurOrderDetail(billNo)));

                // 返回一个包含订单列表和订单详细信息的 Pair
                return new Pair<>(purOrders, purOrderDetails);
            })
            .forEach(pair -> {
                // 获取当前时间戳
                long currentTimeMillis = System.currentTimeMillis();

                // 发送采购订单数据到 OSS
                service.send(
                    OssData.builder()
                        .database(DATABASE)
                        .tableName("pur_order")
                        .syncType("inc")
                        .requestTimestamp(currentTimeMillis)
                        .folderDate(yesterday)
                        .content(pair.getKey()) // 订单列表
                        .headers(null)
                        .build()
                );

                // 发送采购订单详细信息到 OSS
                service.send(
                    OssData.builder()
                        .database(DATABASE)
                        .tableName("pur_order_detail")
                        .syncType("inc")
                        .requestTimestamp(currentTimeMillis)
                        .folderDate(yesterday)
                        .content(pair.getValue()) // 订单详细信息
                        .headers(null)
                        .build()
                );
            });

        return "data upload success";
    }
}