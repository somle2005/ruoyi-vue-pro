package com.somle.eccang.model.req.erp.order;

import lombok.Data;
import lombok.Builder;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangErpOrderVerifyReqVO {

    /**
     * 订单号数组 - 必填参数
     * 类型: Array，对应Java的List<String>
     */
    private List<String> orderCodeArr;

    /**
     * 发货方式 - 默认值"0"
     * 0：按照默认仓库（默认）
     * 1：重新指定仓库
     */
    private String verifyType;

    /**
     * 仓库代码 - 当verify_type=1时需要
     */
    private String warehouseCode;

    /**
     * 配送方式 - 当verify_type=1时需要
     */
    private String shippingMethod;

    /**
     * 是否需仓库确定实物配送方式 - 默认值"0"
     * 0：否（默认）
     * 1：是
     */
    private String warehouseVerifyShippingMethod;

    /**
     * 是否锁定库存 - 默认值"0"
     * 0：否（默认）
     * 1：是
     */
    private String warehouseHoldInventory;

    /**
     * 是否始终不标记订单发货 - 默认值"0"
     * 0：否（默认）
     * 1：是
     */
    private String notPlatformShipped;

    /**
     * 是否标记为组装产品订单 - 默认值"0"
     * 0：否（默认）
     * 1：是
     */
    private String markCombinationOrder;
}