package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.returns;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - 采购退货汇总 Response VO")
@Data
public class SrmPurchaseReturnSummaryRespVO {
    @Schema(description = "数量")
    private BigDecimal sumQty;
    @Schema(description = "总价")
    private BigDecimal sumTotalPrice;
    @Schema(description = "税额")
    private BigDecimal sumTax;
    @Schema(description = "出库数量")
    private BigDecimal sumOutboundQty;
    @Schema(description = "实际入库数量")
    private BigDecimal sumActualQty;
} 