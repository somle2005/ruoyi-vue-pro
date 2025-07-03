package com.somle.xincang.model.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
@Builder
public class XinCangOrderListReq {
    /**
     * 关键字可以填订单号，参考号
     */
    private String key;
    private Integer limit;
    /**
     * 多个单号用空格分隔
     */
    private String multiKey;
    /**
     * 枚举：跟踪号，参考号，单号中选一个（gzh,ckh,order_no）
     */
    private String multiKeyType;
    /**
     * 时间区间，两个日期之间“ - "隔开
     */
    private String orderDate;
    /**
     * 枚举：创建日期，审核日期，发货日期中选一个(gmt_create, approve_time, delivered_time)
     */
    private String orderDateType;
    private Integer page;
    /**
     * 0->待处理  1->待发货  2->拣货中  3->已拣货  4->已贴单  5->已发货  9->拦截订单  10->问题订单  11->缺货确认  12->取消订单
     */
    private String state;
    /**
     * {AD7E58BF-8F48-941C-3DC0-0B6B5BD2E9BF}
     */
    private String token;
}