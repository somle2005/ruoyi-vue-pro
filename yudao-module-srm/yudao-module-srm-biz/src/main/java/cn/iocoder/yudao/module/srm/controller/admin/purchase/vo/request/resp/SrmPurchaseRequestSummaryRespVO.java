package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.request.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "管理后台 - 采购申请单明细汇总 Response VO")
public class SrmPurchaseRequestSummaryRespVO {
    @Schema(description = "申请数量（sum qty）")
    private Integer sumQty;
    @Schema(description = "批准数量（sum approvedQty）")
    private Integer sumApprovedQty;
    @Schema(description = "税额，单位：元 sum tax")
    private BigDecimal sumTax;
    @Schema(description = "含税单价（sum grossPrice）")
    private BigDecimal sumGrossPrice;
    @Schema(description = "参考单价合计（sum ReferenceUnitPrice）")
    private BigDecimal sumReferenceUnitPrice;
    @Schema(description = "价税合计（sum grossTotalPrice）")
    private BigDecimal sumGrossTotalPrice;
    @Schema(description = "产品已订购数量（sum orderClosedQty）")
    private Integer sumOrderClosedQty;
    @Schema(description = "入库数量")
    private BigDecimal sumInboundClosedQty;
} 