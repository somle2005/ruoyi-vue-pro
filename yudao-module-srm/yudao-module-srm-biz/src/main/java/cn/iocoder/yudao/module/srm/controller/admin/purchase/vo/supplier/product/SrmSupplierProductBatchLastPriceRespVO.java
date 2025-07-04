package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.product;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "批量获取产品+供应商的上一次成交价-返回结果")
public class SrmSupplierProductBatchLastPriceRespVO {
    @Schema(description = "产品+供应商的上一次成交价列表")
    private List<Item> items;

    @Data
    @Schema(description = "产品+供应商的上一次成交价")
    public static class Item {
        @Schema(description = "产品ID")
        private Long productId;
        @Schema(description = "供应商ID")
        private Long supplierId;
        @Schema(description = "上一次成交价")
        private BigDecimal lastPrice;

        @Schema(description = "税率")
        private BigDecimal taxRate;

        @Schema(description = "采购货币代码")
        private Integer purchasePriceCurrencyCode;
    }
} 