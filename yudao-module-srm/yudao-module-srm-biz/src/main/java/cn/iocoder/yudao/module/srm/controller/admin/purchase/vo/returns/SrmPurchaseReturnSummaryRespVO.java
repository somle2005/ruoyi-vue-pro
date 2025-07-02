package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.returns;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - 采购退货汇总 Response VO")
@Data
public class SrmPurchaseReturnSummaryRespVO {
    @Schema(description = "数量")
    private BigDecimal sumQty;

    @Schema(description = "子项总价")
    private BigDecimal sumTotalPriceItem;

    @Schema(description = "主表总价")
    private BigDecimal sumTotalPriceMaster;
    @Schema(description = "税额")
    private BigDecimal sumTax;
    @Schema(description = "出库数量")
    private BigDecimal sumOutboundQty;
    @Schema(description = "实际入库数量")
    private BigDecimal sumActualQty;
    @Schema(description = "含税单价汇总")
    private BigDecimal sumGrossPrice;

    // ====== 主表（单据）汇总 ======
    @Schema(description = "退货单价税合计，单位：元")
    private BigDecimal sumGrossTotalPrice;

    @Schema(description = "退货单最终合计价格，单位：元")
    private BigDecimal sumTotalPriceMain;

    @Schema(description = "退货单总毛重，单位：kg")
    private BigDecimal sumTotalWeight;

    @Schema(description = "退货单总体积，单位：mm³")
    private BigDecimal sumTotalVolume;

    @Schema(description = "退货单已退款金额，单位：元")
    private BigDecimal sumRefundPrice;

    @Schema(description = "退货单合计产品价格，单位：元")
    private BigDecimal sumTotalProductPrice;

    @Schema(description = "退货单合计税额，单位：元")
    private BigDecimal sumTotalGrossPrice;

    @Schema(description = "退货单优惠金额，单位：元")
    private BigDecimal sumDiscountPrice;

    @Schema(description = "退货单其它金额，单位：元")
    private BigDecimal sumOtherPrice;
} 