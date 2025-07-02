package cn.iocoder.yudao.module.srm.service.purchase.bo.order;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 采购订单汇总 BO
 *
 * @author wdy
 */
@Data
public class SrmPurchaseOrderSummaryBO {
    /**
     * 含税单价
     */
    private BigDecimal sumGrossPrice;
    /**
     * 下单数量
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
     * 价税合计
     */
    private BigDecimal sumGrossTotalPrice;
    /**
     * 合计产品价格
     */
    private BigDecimal sumTotalProductPrice;
    /**
     * 合计税额
     */
    private BigDecimal sumTotalGrossPrice;
    /**
     * 入库数量
     */
    private BigDecimal sumInboundClosedQty;
    /**
     * 退货数量
     */
    private BigDecimal sumReturnCount;
    /**
     * 已付款金额
     */
    private BigDecimal sumPayPrice;
    /**
     * 优惠金额
     */
    private BigDecimal sumDiscountPrice;
    /**
     * 定金金额
     */
    private BigDecimal sumDepositPrice;
    /**
     * 质检通过数量
     */
    private Integer sumTotalInspectionPassCount;
    /**
     * 完工通过数量
     */
    private Integer sumTotalCompletionPassCount;

    /**
     * 汇总待入库数量
     * 动态计算：sumQty - sumInboundClosedQty
     */
    private BigDecimal sumWaitInCount;
} 