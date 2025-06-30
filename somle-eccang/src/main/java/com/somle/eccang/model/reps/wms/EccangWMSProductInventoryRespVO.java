package com.somle.eccang.model.reps.wms;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangWMSProductInventoryRespVO {
    private String productBarcode;      // 产品编码
    private String productSku;          // SKU
    private String referenceNo;         // 自定义编码
    private String productTitle;        // 产品名称
    private String productTitleEn;      // 产品名称(英文)
    private String warehouseCode;       // 仓库代码
    private Integer onway;               // 在途数量
    private Integer pending;             // 待上架数量
    private Integer sellable;            // 可售数量
    private Integer unsellable;          // 不合格数量
    private Integer reserved;            // 待出库数量
    private Integer shipped;             // 历史出库数量
    private Integer soldShared;          // 分享库存出库数量
    private Integer shared;              // 分享库存数量
    private Integer warning;             // 预警库存数量
    private LocalDateTime piUpdateTime;        // 库存最新修改时间
    private String warehouseDesc;       // 仓库描述
    private List<BatchInfo> batchInfo;  // 批次信息数组

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class BatchInfo {
        private String receivingCode;       // 入库单号
        private Integer sellableQuantity;   // 可售数量
        private Integer reservedQuantity;   // 待出库数量
        private Integer stockAge;           // 库龄
        private String lcCode;  // 库位
        private LocalDateTime ibFifoTime;          // 上架时间
        private Integer ibStatus;           // 状态: 0-不可用, 1-可用
        private Integer ibType;             // 库存类型:0-标准 1-不良品 2-暂存
    }
}
