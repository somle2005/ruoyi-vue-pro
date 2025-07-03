package com.somle.xincang.model.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
@Builder
public class XingCangStockListReq {
    /**
     * 传1的时候显示库存为0的产品，此时无需传product_no参数。
     */
    private String isShowZero;
    /**
     * 每页条数
     */
    private Integer limit;
    /**
     * 页码
     */
    private Integer page;
    /**
     * 产品编号
     */
    private String productNo;
    private String token;
    /**
     * 仓库编码
     */
    private String warehouseCode;
}
