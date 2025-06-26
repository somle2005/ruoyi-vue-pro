package cn.iocoder.yudao.module.srm.service.purchase.bo.in;

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
     * 已付款金额
     */
    private BigDecimal sumPayPrice;
} 