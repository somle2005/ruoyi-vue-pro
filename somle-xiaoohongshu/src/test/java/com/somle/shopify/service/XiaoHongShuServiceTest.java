package com.somle.shopify.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.xiaohongshu.service.XiaoHongShuClient;
import com.somle.xiaohongshu.service.XiaoHongShuService;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetOrderListRequest;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


@Disabled
@Slf4j
@Import({
    XiaoHongShuService.class
})
class XiaoHongShuServiceTest extends SomleBaseDbUnitTest {
    @Resource
    private XiaoHongShuService xiaoHongShuService;
   @Test
    public void test1() {
       XiaoHongShuClient  xiaoHongShuClient = xiaoHongShuService.clients.get(0);
       xiaoHongShuClient.getAuthCode();
   }
   @Test
    public void test2() {
       xiaoHongShuService.clients.get(0).getAllProducts();
   }
   @Test
    public void test3() {
       String dateStr = "2025-06-04 23:59:59";
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       LocalDateTime dateTime = LocalDateTime.parse(dateStr, formatter);
       long timestamp = dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
       String aa = "2025-06-04 00:00:00";
       LocalDateTime aaTime = LocalDateTime.parse(aa, formatter);
       long timestamp2 = aaTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
       GetOrderListRequest request = GetOrderListRequest.builder().pageNo(1).pageSize(100).startTime(timestamp2).endTime(timestamp).timeType(1).build();
       xiaoHongShuService.clients.get(0).getAllOrderDetail(request);
   }
}