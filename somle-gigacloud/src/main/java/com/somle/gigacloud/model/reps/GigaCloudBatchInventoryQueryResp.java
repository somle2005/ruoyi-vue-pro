package com.somle.gigacloud.model.reps;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class GigaCloudBatchInventoryQueryResp {
    /**
     * 状态码 (200=成功)
     */
    private Integer code;
    
    /**
     * 操作消息 ("Query successfully")
     */
    private String msg;
    
    /**
     * 当前页码 (从1开始)
     */
    private Integer pageNum;
    
    /**
     * 每页条数
     */
    private Integer pageSize;
    
    /**
     * 总记录数
     */
    private Integer total;
    
    /**
     * 库存数据列表
     */
    private List<InventoryItem> data;
    
    /**
     * 错误信息 (成功时为null)
     */
    private String error;


    /**
     * 库存项详情实体
     */
    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class InventoryItem {
        // 客户信息
        private String customerCode;
        private Integer country;
        private String countryDesc;

        // 仓库信息
        private String whId;
        private String whName;
        private String warehouseCode; // 与whId重复，可根据需求取舍

        // 产品信息
        private String productCode;
        private String customerSku;
        private String productName;
        private String productNameZh;

        // 产品分类
        private Integer productType; // 使用枚举更安全
        private String productTypeDesc;

        // 物流特性
        private Boolean ltl; // 改用Boolean代替int (0=false, 1=true)
        private String ltlDesc;

        private Boolean irregular; // 改用Boolean
        private String irregularDesc;

        // 库存数量
        private Integer inStockQty;
        private Integer originalQty;
        private Integer receiveDays;

        // 批次信息
        private String batchNumber;
        private String containerCode;
        private LocalDate receiveDate; // 使用日期类型

        // 业务类型
        private Integer transactionType; // 使用枚举
        private Boolean newTransferFlag;

    }
}
