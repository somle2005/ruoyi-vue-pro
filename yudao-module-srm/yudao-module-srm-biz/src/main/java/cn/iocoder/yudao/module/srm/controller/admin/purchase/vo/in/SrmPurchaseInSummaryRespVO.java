package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - 采购入库汇总 Response VO")
@Data
public class SrmPurchaseInSummaryRespVO {

    // ========== 子表汇总（入库项表 SrmPurchaseInItemDO） ==========

    /**
     * 到货数量
     */
    @Schema(description = "到货数量")
    private BigDecimal sumQty;

    /**
     * 实际入库数量
     */
    @Schema(description = "实际入库数量")
    private BigDecimal sumActualQty;

    /**
     * 总价
     */
    @Schema(description = "总价")
    private BigDecimal sumTotalPrice;

    /**
     * 税额
     */
    @Schema(description = "税额")
    private BigDecimal sumTax;

    /**
     * 价税合计
     */
    @Schema(description = "价税合计")
    private BigDecimal sumGrossTotalPrice;

    /**
     * 含税单价
     */
    @Schema(description = "含税单价")
    private BigDecimal sumGrossPrice;

    /**
     * 已付款金额
     */
    @Schema(description = "已付款金额")
    private BigDecimal sumPayPrice;

    // ========== 主表汇总（入库单主表 SrmPurchaseInDO） ==========

    /**
     * 总毛重kg
     */
    @Schema(description = "总毛重kg")
    private BigDecimal sumTotalWeight;

    /**
     * 总体积mm³
     */
    @Schema(description = "总体积mm³")
    private BigDecimal sumTotalVolume;

    /**
     * 优惠金额
     */
    @Schema(description = "优惠金额")
    private BigDecimal sumDiscountPrice;

    /**
     * 其它金额
     */
    @Schema(description = "其它金额")
    private BigDecimal sumOtherPrice;

    /**
     * 已支付金额
     */
    @Schema(description = "已支付金额")
    private BigDecimal sumPaymentPrice;
} 