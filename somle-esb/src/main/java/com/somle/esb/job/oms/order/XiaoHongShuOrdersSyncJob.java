package com.somle.esb.job.oms.order;

import cn.iocoder.yudao.module.oms.api.dto.OmsOrderSaveReqDTO;
import com.somle.esb.converter.oms.XiaoHongShuToOmsConverter;
import com.somle.xiaohongshu.service.XiaoHongShuService;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetOrderListRequest;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Slf4j
@Component
public class XiaoHongShuOrdersSyncJob extends BaseOrdersSyncJob {

    @Resource
    private XiaoHongShuService xiaoHongShuService;
    @Resource
    private XiaoHongShuToOmsConverter xiaoHongShuToOmsConverter;
    @Override
    public List<OmsOrderSaveReqDTO> listOrders(String param) {

        LocalDate baseDate = LocalDate.parse(param);
        // 2. 计算前两天的日期
        LocalDate targetDate = baseDate.minusDays(2);
        // 3. 生成起始时间（00:00:00）
        LocalDateTime startTime = targetDate.atStartOfDay();
        // 4. 生成结束时间（23:59:59）
        LocalDateTime endTime = targetDate.atTime(23, 59, 59);
        long startTimestamp = startTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long endTimeStamp = endTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        GetOrderListRequest request = GetOrderListRequest.builder().pageNo(1).pageSize(100).startTime(startTimestamp).endTime(endTimeStamp).timeType(1).build();
        return xiaoHongShuService.clients.stream()
            .flatMap(client -> xiaoHongShuToOmsConverter.toOrders(client.getAllOrderDetail(request), client.getXiaoHongShuAccount()).stream())
            .toList();
    }
}
