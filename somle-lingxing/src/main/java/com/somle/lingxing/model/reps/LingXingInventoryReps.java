package com.somle.lingxing.model.reps;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 库存查询完整实体类（包含请求参数和响应结构）
 */
@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class LingXingInventoryReps {
    private Integer code;
    private ResponseData data;
    private String msg;

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class ResponseData {
        private Integer total;
        private Integer page;
        private Integer pageSize;
        private Integer pages;
        private List<InventoryRecord> records;

        @Data
        @NoArgsConstructor
        @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
        public static class InventoryRecord {
            private String customerCode;
            private String whCode;
            private String whName;
            private String sku;
            private String skuId;
            private Integer stockType;
            private Integer totalAmount;
            private Integer productTotalAmount;
            private Integer boxTotalAmount;
            private Integer fbaReturnTotalAmount;
            private String productName;
            private String operateTime;
            private StockDetail productStockDtl;
            private StockDetail boxStockDtl;
            private StockDetail fbaReturnStockDtl;

            @Data
            @NoArgsConstructor
            @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
            public static class StockDetail {
                private Integer availableAmount;
                private Integer lockAmount;
                private Integer transportAmount;
            }
        }
    }
}
