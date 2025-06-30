package com.somle.eccang.model.req.erp.order;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangErpCancelOrderReqVO {
    //销售单号，创建订单返回
    private String orderCode;
    //订单新状态，只能是0和7两个值，0已废弃、7问题件
    private String targetStatus;
}
