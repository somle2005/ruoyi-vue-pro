package com.somle.esb.job.oms.order;

import cn.iocoder.yudao.module.oms.api.dto.OmsOrderSaveReqDTO;
import com.somle.esb.converter.oms.OverstockToOmsConverter;
import com.somle.overstock.service.OverstockService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class OverstockOrdersSyncJob extends BaseOrdersSyncJob{

    @Resource
    private OverstockService overstockService;
    @Resource
    private OverstockToOmsConverter converter;
    @Override
    public List<OmsOrderSaveReqDTO> listOrders(String param) {
        LocalDate baseDate = LocalDate.parse(param);
        // 2. 计算前两天的日期
        LocalDate targetDate = baseDate.minusDays(2);
        // 3. 生成结束时间（23:59:59）
        String endTime = targetDate.plusDays(1L).toString();
        return overstockService.clients.stream()
            .flatMap(client -> {
                return converter.toOrders(client.getOrders(targetDate.toString(), endTime), client.getAccount()).stream();
            }).toList();
    }
}
