package cn.iocoder.yudao.module.srm.api.purchase.dto;

import cn.iocoder.yudao.module.srm.enums.status.SrmAuditStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 采购退货单 DTO
 */
@Data
public class SrmPurchaseReturnDTO {

    /**
     * 编号
     */
    private Long id;
    /**
     * 乐观锁
     */
    private Integer version;
    /**
     * 采购退货单号
     */
    private String code;
    /**
     * 审批状态
     * <p>
     * 枚举 {@link SrmAuditStatus}
     */
    private Integer auditStatus;
    /**
     * 审核者id
     */
    private Long auditorId;
    /**
     * 审核时间
     */
    private LocalDateTime auditTime;
    /**
     * 审核意见
     */
    private String auditAdvice;
    /**
     * 供应商编号
     * <p>
     */
    private Long supplierId;
    /**
     * 结算账户编号
     * <p>
     */
    private Long accountId;
    /**
     * 退货时间
     */
    private LocalDateTime returnTime;

    /**
     * 币种编号
     */
    private Long currencyId;
    /**
     * 价税合计
     */
    private BigDecimal grossTotalPrice;

    /**
     * 合计数量
     */
    private BigDecimal totalCount;
    /**
     * 最终合计价格，单位：元
     * <p>
     * totalPrice = totalProductPrice + totalGrossPrice - discountPrice + otherPrice
     */
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
     * 优惠率，百分比
     */
    private BigDecimal discountPercent;
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

    /**
     * 附件地址
     */
    private String fileUrl;
    /**
     * 备注
     */
    private String remark;

    /**
     * 退款状态
     */
    private Integer refundStatus;
    /**
     * 出库状态
     */
    private Integer outboundStatus;
    /**
     * 退货明细列表
     */
    private List<SrmPurchaseReturnItemDTO> items;

} 