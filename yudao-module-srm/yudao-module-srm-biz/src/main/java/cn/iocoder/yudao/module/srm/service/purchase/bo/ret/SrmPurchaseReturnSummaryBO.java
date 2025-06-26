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
} 