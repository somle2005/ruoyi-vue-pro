package com.somle.esb.job.oms.order;

import cn.iocoder.yudao.module.oms.api.dto.OmsOrderSaveReqDTO;
import com.somle.autonomous.service.AutonomousService;
import com.somle.esb.converter.oms.AutonomousToOmsConverter;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Component
public class AutonomousOrdersSyncJob extends BaseOrdersSyncJob {

    @Resource
    AutonomousService autonomousService;
    @Resource
    AutonomousToOmsConverter autonomousToOmsConverter;

    @Override
    public List<OmsOrderSaveReqDTO> listOrders(String param) {
        LocalDate baseDate = LocalDate.parse(param);
        // 2. 计算前两天的日期
        LocalDate targetDate = baseDate.minusDays(2);
        // 3. 生成起始时间（00:00:00）
        LocalDateTime startTime = targetDate.atStartOfDay();
        // 4. 生成结束时间（23:59:59）
        LocalDateTime endTime = targetDate.atTime(23, 59, 59);

        ZonedDateTime startTimeUTC = startTime.atZone(ZoneId.of("UTC"));
        ZonedDateTime endTimeUTC = endTime.atZone(ZoneId.of("UTC"));
        return autonomousService.autonomousClients.stream()
            // 根据邮箱去重客户端
            .collect(Collectors.collectingAndThen(
                Collectors.toMap(
                    client -> client.autonomousAccount.getEmail(), // 使用邮箱作为键
                    Function.identity(),                     // 保留客户端对象
                    (existing, replacement) -> existing      // 遇到重复时保留第一个客户端
                ),
                map -> map.values().stream()                  // 将去重后的值转为流
            ))
            // 处理每个去重后的客户端
            .flatMap(client -> {
                try {
                    // 获取并转换订单
                    return autonomousToOmsConverter.toOrders(
                        client.getAllOrder(
                            startTimeUTC.format(DateTimeFormatter.ISO_INSTANT),
                            endTimeUTC.format(DateTimeFormatter.ISO_INSTANT)
                        ),
                        client.autonomousAccount
                    ).stream();
                } catch (Exception e) {
                    log.error("Failed to fetch orders for client: {}", client.autonomousAccount.getEmail(), e);
                    return Stream.empty();
                }
            })
            .toList();
    }
}
