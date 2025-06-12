package com.somle.esb.job.oms.order;

import cn.iocoder.yudao.module.oms.api.dto.OmsOrderSaveReqDTO;
import com.somle.esb.converter.oms.Home24ToOmsConverter;
import com.somle.esb.converter.oms.MediaMarktToOmsConverter;
import com.somle.home24.model.req.Home24OrderReq;
import com.somle.home24.service.Home24Service;
import com.somle.mediamarkt.model.req.MediaMarktOrderReq;
import com.somle.mediamarkt.service.MediaMarktService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Component

public class MediaMarktOrdersSyncJob extends BaseOrdersSyncJob {
    @Resource
    MediaMarktService mediaMarktService;
    @Resource
    MediaMarktToOmsConverter mediaMarktToOmsConverter;

    @Override
    public List<OmsOrderSaveReqDTO> listOrders(String param) {

        LocalDate baseDate = LocalDate.parse(param);
        // 2. 计算前两天的日期
        LocalDate targetDate = baseDate.minusDays(2);
        // 3. 生成起始时间（00:00:00）
        LocalDateTime startTime = targetDate.atStartOfDay();
        // 4. 生成结束时间（23:59:59）
        LocalDateTime endTime = targetDate.atTime(23, 59, 59);

        MediaMarktOrderReq req = MediaMarktOrderReq.builder()
            .max(100)
            .startDate(startTime.toString())
            .endDate(endTime.toString())
            .build();
        return mediaMarktService.clients.stream().flatMap(client -> mediaMarktToOmsConverter.toOrders(client.getAllOrders(req), client).stream()).toList();
    }
}
