package com.somle.eccang.model.req.wms.order;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangWMSCancelOrderReqVO {

    /**
     * 订单号（必填）
     */
    private String orderCode;

    /**
     * 截单原因（可选）
     */
    private String reason;
}