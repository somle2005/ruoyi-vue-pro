package com.somle.xincang.model.resp;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class XinCangStockListResp {

    private Rst rst;
    private Integer errno;
    private String err;

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class Rst {
        private String code;
        private String msg;
        private List<InventoryItem> data;
        private String count; // 根据JSON值类型使用String
    }

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class InventoryItem {
        private String customerId;
        private String customerName;
        private String productSku;
        private String volumeCm;     // 体积字段使用String（含小数）
        private String warehouseId;
        private String realStock;     // 实际库存
        private String shipSkuCount;  // 运输中数量
        private String waitSkuCount;  // 等待处理数量
        private String useSkuCount;   // 已使用数量
        private String cansaleSkuCount; // 可售数量
        private String warehouseCode;
        private Integer alermCount;   // 使用包装类型处理null值
    }
}