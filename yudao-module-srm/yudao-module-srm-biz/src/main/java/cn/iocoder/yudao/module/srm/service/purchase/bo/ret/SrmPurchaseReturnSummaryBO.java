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
     * 总价
     */
    private BigDecimal sumTotalPrice;
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
    private BigDecimal grossTotalPrice;

    private BigDecimal totalPrice;

    /**
     * 总毛重，单位：kg
     */
    private BigDecimal totalWeight;
    /**
     * 总体积,毫米，单位：mm³
     */
    private BigDecimal totalVolume;

    /**
     * 已退款金额，单位：元
     * <p>
     */
    private BigDecimal refundPrice;
    /**
     * 合计产品价格，单位：元
     */
    private BigDecimal totalProductPrice;
    /**
     * 合计税额，单位：元
     */
    private BigDecimal totalGrossPrice;

    /**
     * 优惠金额，单位：元
     * <p>
     * discountPrice = (totalProductPrice + totalGrossPrice) * discountPercent
     */
    private BigDecimal discountPrice;
    /**
     * 其它金额，单位：元
     */
    private BigDecimal otherPrice;
} 