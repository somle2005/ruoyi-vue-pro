package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - 采购入库汇总 Response VO")
@Data
public class SrmPurchaseInSummaryRespVO {
    @Schema(description = "到货数量")
    private BigDecimal sumQty;
    @Schema(description = "实际入库数量")
    private BigDecimal sumActualQty;
    @Schema(description = "总价")
    private BigDecimal sumTotalPrice;
    @Schema(description = "税额")
    private BigDecimal sumTax;
    @Schema(description = "价税合计")
    private BigDecimal sumGrossTotalPrice;
    @Schema(description = "已付款金额")
    private BigDecimal sumPayPrice;
} 