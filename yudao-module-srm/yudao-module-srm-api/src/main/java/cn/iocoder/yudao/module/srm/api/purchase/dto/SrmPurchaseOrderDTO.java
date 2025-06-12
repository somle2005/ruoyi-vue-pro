package cn.iocoder.yudao.module.srm.api.purchase.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 采购订单 DTO
 */
@Data
public class SrmPurchaseOrderDTO {

    /**
     * 编号
     */
    private Long id;
    /**
     * 采购单编号
     */
    private String code;
    /**
     * 供应商编号(乙方)
     */
    private Long supplierId;
    //供应商名称
    private String supplierName;
    /**
     * 结算账户编号
     */
    private Long accountId;
    /**
     * 合计数量
     */
    private BigDecimal totalCount;
    /**
     * 币别id(财务管理-币别维护)
     */
    private Long currencyId;
    /**
     * 币别名称
     */
    private String currencyName;
    /**
     * 合计价格，单位：元
     */
    private BigDecimal totalPrice;
    /**
     * 合计产品价格，单位：元
     */
    private BigDecimal totalProductPrice;
    /**
     * 合计税额，单位：元
     */
    private BigDecimal totalGrossPrice;
    /**
     * 优惠率，百分比
     */
    private BigDecimal discountPercent;
    /**
     * 优惠金额，单位：元
     */
    private BigDecimal discountPrice;
    /**
     * 定金金额，单位：元
     */
    private BigDecimal depositPrice;
    /**
     * 附件地址
     */
    private String fileUrl;
    /**
     * 备注
     */
    private String remark;
    /**
     * 采购入库数量
     */
    private BigDecimal totalInboundCount;
    /**
     * 采购退货总数
     */
    private BigDecimal totalReturnCount;
    /**
     * 单据日期
     */
    private LocalDateTime billTime;
    /**
     * 结算日期
     */
    private LocalDateTime settlementDate;
    /**
     * 审核人id
     */
    private Long auditorId;
    /**
     * 审核时间
     */
    private LocalDateTime auditTime;
    /**
     * 财务主体id(采购公司，甲方)
     */
    private Long purchaseCompanyId;
    /**
     * 仓库id
     */
    private Long warehouseId;
    /**
     * 开关状态
     */
    private Integer offStatus;
    /**
     * 执行状态
     */
    private Integer executeStatus;
    /**
     * 入库状态
     */
    private Integer inboundStatus;
    /**
     * 付款状态
     */
    private Integer payStatus;
    /**
     * 审核状态
     */
    private Integer auditStatus;
    /**
     * 收货地址
     */
    private String address;
    /**
     * 付款条款(快照)
     */
    private String paymentTerms;
    /**
     * 装运港
     */
    private String fromPortName;
    /**
     * 目的港
     */
    private String toPortName;
    /**
     * 采购状态
     */
    private Integer orderStatus;
    /**
     * 审核意见
     */
    private String auditAdvice;
    /**
     * 订单明细列表
     */
    private List<SrmPurchaseOrderItemDTO> items;

} 