package com.somle.xincang.model.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
@Builder
public class XinCangDoInterceptReq{
    /**
     * 参考号，多个参考号以 ","分隔； 订单号和参考号根据需求二选一传参
     */
    private String ckhs;
    /**
     * 订单号，多个订单号以 ","分隔 ；订单号和参考号根据需求二选一传参
     */
    private String ordernos;
}