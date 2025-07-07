package com.somle.gigacloud.model.reps;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GigaCloudInventorySearchReps {
    /**
     * 状态码（示例：200）
     */
    private Integer code;

    /**
     * 消息描述（示例："Query successfully"）
     */
    private String msg;

    /**
     * 当前页码（示例：1）
     */
    private Integer pageNum;

    /**
     * 每页条数（示例：1）
     */
    private Integer pageSize;

    /**
     * 总记录数（示例：455）
     */
    private Integer total;

    /**
     * 具体数据列表
     */
    private List<ProductInfo> data;

    /**
     * 错误信息（成功时为null）
     */
    private Object error;




    /**
     * 产品信息实体类
     */
    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class ProductInfo {
        /**
         * 客户编码（示例："D303"）
         */
        private String customerCode;

        /**
         * 客户ID（示例：772）
         */
        private Integer customerId;

        /**
         * 国家代码（示例：2）
         */
        private Integer country;

        /**
         * 国家描述（示例："UK"）
         */
        private String countryDesc;

        /**
         * 仓库ID（示例：100）
         */
        private Integer whId;

        /**
         * 产品编码（示例："D30323061"）
         */
        private String productCode;

        /**
         * 客户SKU编码（示例："CD307001WB"）
         */
        private String customerSku;

        /**
         * 产品名称（示例："CD307001WB"）
         */
        private String productName;

        /**
         * 产品中文名称（示例："-"）
         */
        private String productNameZh;

        /**
         * 产品类型（示例：0）
         */
        private Integer productType;

        /**
         * 产品类型描述（示例："Cargo"）
         */
        private String productTypeDesc;

        /**
         * 仓库名称（示例："TEMP"）
         */
        private String whName;

        /**
         * 可用库存量（示例：0）
         */
        private Integer availableStockQty;

        /**
         * 在库库存量（示例：0）
         */
        private Integer inStockQty;

        /**
         * 在用库存量（示例：0）
         */
        private Integer inUsedStockQty;

        /**
         * 已交付数量（示例：13625）
         */
        private Integer deliveredQty;
    }
}

