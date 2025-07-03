package com.somle.xincang.model.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
@Builder
public class XinCangDeleteOrderReq {
    /**
     * 参考号； 订单号和参考号根据需求二选一传参
     */
    private String ckh;
    /**
     * 订单号； 订单号和参考号根据需求二选一传参
     */
    private String orderNo;
}