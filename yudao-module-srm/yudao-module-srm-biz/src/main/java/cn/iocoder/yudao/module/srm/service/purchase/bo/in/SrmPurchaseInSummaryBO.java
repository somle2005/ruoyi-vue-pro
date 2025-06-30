package cn.iocoder.yudao.module.srm.service.purchase.bo.in;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 采购入库汇总 BO
 *
 * @author wdy
 */
@Data
public class SrmPurchaseInSummaryBO {
    /**
     * 到货数量
     */
    private BigDecimal sumQty;
    /**
     * 实际入库数量
     */
    private BigDecimal sumActualQty;
    /**
     * 总价
     */
    private BigDecimal sumTotalPrice;
    /**
     * 税额
     */
    private BigDecimal sumTax;
    /**
     * 价税合计
     */
    private BigDecimal sumGrossTotalPrice;
    /**
     * 含税单价
     */
    private BigDecimal sumGrossPrice;
    /**
     * 已付款金额
     */
    private BigDecimal sumPayPrice;

    /**
     * 产品价格
     */
    private BigDecimal sumProductPrice;

    //master

    @Schema(description = "总毛重kg")
    private BigDecimal sumTotalWeight;

    @Schema(description = "总体积mm³")
    private BigDecimal sumTotalVolume;

    /**
     * 优惠金额
     */
    private BigDecimal sumDiscountPrice;

    /**
     * 其它金额
     */
    private BigDecimal sumOtherPrice;
    /**
     * 已支付金额
     */
    private BigDecimal sumPaymentPrice;

} 