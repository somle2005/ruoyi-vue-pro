package cn.iocoder.yudao.module.srm.api.purchase.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 采购订单项 DTO
 */
@Data
public class SrmPurchaseOrderItemDTO {
    /**
     * 编号
     */
    private Long id;
    /**
     * 仓库编号
     */
    private Long warehouseId;
    /**
     * 采购订单编号
     */
    private Long orderId;
    /**
     * 产品编号
     */
    private Long productId;
    /**
     * 产品单位单位
     */
    private Long productUnitId;
    /**
     * 商品行备注
     */
    private String remark;
    // ========== 合计 ==========
    /**
     * 产品单位单价，单位：元
     */
    private BigDecimal productPrice;
    /**
     * 下单数量
     */
    private BigDecimal qty;
    /**
     * 总价，单位：元
     */
    private BigDecimal totalPrice;
    /**
     * 税率，百分比
     */
    private BigDecimal taxRate;
    /**
     * 税额，单位：元
     */
    private BigDecimal tax;
    /**
     * 含税单价
     */
    private BigDecimal grossPrice;
    /**
     * 价税合计
     */
    private BigDecimal grossTotalPrice;
    // ========== 采购金额和数量 ==========
    /**
     * 合计产品价格，单位：元
     */
    private BigDecimal totalProductPrice;
    /**
     * 合计税额
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
     * 应付款余额，查询时显示，新增时无需填写
     */
    private BigDecimal payableBalance;
    /**
     * 已付款金额
     */
    private BigDecimal payPrice;
    // ========== 采购入库 ==========
    /**
     * 入库数量
     */
    private BigDecimal inboundClosedQty;
    // ========== 采购退货（出库）） ==========
    /**
     * 退货数量
     */
    private BigDecimal returnCount;
    // ========== 其他 ==========
    /**
     * 交货日期
     */
    private LocalDateTime deliveryTime;
    /**
     * 关闭状态
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
     * 采购申请项ID
     */
    private Long purchaseApplyItemId;
    /**
     * 采购申请单code
     */
    private String purchaseApplyCode;

    private String fbaCode;
    private String containerRate;
    /**
     * 汇率
     */
    private BigDecimal exchangeRate;
    /**
     * 币别id
     */
    private Long currencyId;
    /**
     * 币别名称
     */
    private String currencyName;
    /**
     * 申请人id
     */
    private Long applicantId;
    /**
     * 申请部门id
     */
    private Long applicationDeptId;

    /**
     * 报关品名
     */
    private String declaredType;

    /**
     * 英文报关品名
     */
    private String declaredTypeEn;

    /**
     * 产品编码
     */
    private String productCode;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 产品单位名称
     */
    private String productUnitName;

    /**
     * 单据来源描述
     */
    private String source;

    /**
     * 验货单，JSON 格式
     */
    private String inspectionJson;
    /**
     * 总验货通过数量
     */
    private Integer totalInspectionPassCount;
    /**
     * 完工单，JSON 格式
     */
    private String completionJson;
    /**
     * 总完工单通过数量
     */
    private Integer totalCompletionPassCount;
} 