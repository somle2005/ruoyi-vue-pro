package cn.iocoder.yudao.module.srm.service.purchase.bo.request;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 采购申请字段汇总BO
 *
 * @author: wdy
 */
@Data
public class SrmPurchaseRequestSummaryBO {
    /**
     * 申请数量（sum qty）
     */
    private Integer sumQty;
    /**
     * 批准数量（sum approvedQty）
     */
    private Integer sumApprovedQty;
    /**
     * 税额，单位：元 sum tax
     */
    private BigDecimal sumTax;
    /**
     * 含税单价（sum grossPrice）
     */
    private BigDecimal sumGrossPrice;
    /**
     * 参考单价合计（sum ReferenceUnitPrice）
     */
    private BigDecimal sumReferenceUnitPrice;
    /**
     * 价税合计（sum grossTotalPrice）
     */
    private BigDecimal sumGrossTotalPrice;

    /**
     * 产品已订购数量（sum orderClosedQty）
     */
    private Integer sumOrderClosedQty;

    // ========== 采购入库 ==========
    /**
     * 入库数量
     */
    private BigDecimal sumInboundClosedQty;

}
