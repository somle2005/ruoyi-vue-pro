package cn.iocoder.yudao.module.srm.service.purchase.bo.ret;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 采购退货汇总 BO
 *
 * @author wdy
 */
@Data
public class SrmPurchaseReturnSummaryBO {
    /**
     * 数量
     */
    private BigDecimal sumQty;
    /**
     * 子项总价
     */
    private BigDecimal sumTotalPriceItem;
    /**
     * 主表总价
     */
    private BigDecimal sumTotalPriceMaster;
    /**
     * 税额
     */
    private BigDecimal sumTax;
    /**
     * 出库数量
     */
    private BigDecimal sumOutboundQty;
    /**
     * 实际入库数量
     */
    private BigDecimal sumActualQty;
    /**
     * 含税单价
     */
    private BigDecimal sumGrossPrice;

    //master
    /**
     * 价税合计
     */
    private BigDecimal sumGrossTotalPrice;


    /**
     * 总毛重，单位：kg
     */
    private BigDecimal sumTotalWeight;
    /**
     * 总体积,毫米，单位：mm³
     */
    private BigDecimal sumTotalVolume;

    /**
     * 已退款金额，单位：元
     * <p>
     */
    private BigDecimal sumRefundPrice;
    /**
     * 合计产品价格，单位：元
     */
    private BigDecimal sumTotalProductPrice;
    /**
     * 合计税额，单位：元
     */
    private BigDecimal sumTotalGrossPrice;

    /**
     * 优惠金额，单位：元
     * <p>
     * discountPrice = (totalProductPrice + totalGrossPrice) * discountPercent
     */
    private BigDecimal sumDiscountPrice;
    /**
     * 其它金额，单位：元
     */
    private BigDecimal sumOtherPrice;
} 