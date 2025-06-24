package com.somle.esb.job.oms.order;

import cn.iocoder.yudao.module.oms.api.dto.OmsOrderSaveReqDTO;
import com.somle.esb.converter.oms.WangdianToOmsConverter;
import com.somle.wangdian.service.WangdianService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

@Component
@Slf4j
public class WangdianOrdersSyncJob extends BaseOrdersSyncJob{

    @Resource
    private WangdianService wangdianService;
    @Resource
    private WangdianToOmsConverter wangdianToOmsConverter;


    @Override
    public List<OmsOrderSaveReqDTO> listOrders(String param) {
        LocalDate baseDate = LocalDate.parse(param);
        // 2. 计算前两天的日期
        LocalDate targetDate = baseDate.minusDays(2);
        // 4. 生成结束时间（23:59:59）
        LocalDateTime endTime = targetDate.atTime(5, 0, 0);
        // 3. 生成起始时间（00:00:00）
        LocalDateTime startTime = endTime.minusDays(1);
        return wangdianService.clients.stream()
            .flatMap(client -> {
                try {
                    return wangdianToOmsConverter.toOrders(client.getAllOrder(startTime, endTime)).stream();
                } catch (Exception e) {
                    log.error("Failed to fetch orders for client", e);
                    return Stream.empty();
                }
            }).toList();
    }
}
