package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.order;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - 采购订单汇总 Response VO")
@Data
public class SrmPurchaseOrderSummaryRespVO {
    @Schema(description = "含税单价")
    private BigDecimal sumGrossPrice;

    @Schema(description = "下单数量")
    private BigDecimal sumQty;

    @Schema(description = "总价")
    private BigDecimal sumTotalPrice;

    @Schema(description = "税额")
    private BigDecimal sumTax;

    @Schema(description = "价税合计")
    private BigDecimal sumGrossTotalPrice;

    @Schema(description = "合计产品价格")
    private BigDecimal sumTotalProductPrice;

    @Schema(description = "合计税额")
    private BigDecimal sumTotalGrossPrice;

    @Schema(description = "入库数量")
    private BigDecimal sumInboundClosedQty;

    @Schema(description = "退货数量")
    private BigDecimal sumReturnCount;

    @Schema(description = "已付款金额")
    private BigDecimal sumPayPrice;

    @Schema(description = "优惠金额")
    private BigDecimal sumDiscountPrice;

    @Schema(description = "定金金额")
    private BigDecimal sumDepositPrice;

    @Schema(description = "质检通过数量")
    private Integer sumTotalInspectionPassCount;

    @Schema(description = "完工通过数量")
    private Integer sumTotalCompletionPassCount;

    @Schema(description = "待入库数量")
    private BigDecimal sumWaitInCount;
} 