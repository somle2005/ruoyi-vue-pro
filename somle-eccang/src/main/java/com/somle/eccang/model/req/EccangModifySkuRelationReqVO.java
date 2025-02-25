package com.somle.eccang.model.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author: LeeFJ
 * @date: 2025/2/25 10:50
 * @description:
 */
@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangModifySkuRelationReqVO {

    /** 平台sku */
    private String platform_sku;
    /** 仓库代码 */
    private String warehouse_code;
    /** 店铺账号数组 */
    private String user_account;
    /** 仓库sku数据数组 */
    private List<PCR> pcr;
    /** 原仓库SKU数据数组 */
    private String origin;




    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class PCR {
        /** 平台sku */
        private String product_sku;
        /** 仓库代码 */
        private String product_sku_qty;
        /** 店铺账号数组 */
        private String product_sku_name_cn;
        /** 仓库sku数据数组 */
        private String product_sku_pu_price;
        /** 原仓库SKU数据数组 */
        private String origin;
    }

}
