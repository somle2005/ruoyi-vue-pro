package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.returns;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.srm.enums.SrmDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class SrmPurchaseReturnExcelRespVO {
    // ========== 主表字段 ==========
    @ExcelProperty("退货单ID")
    @ExcelMergeGroup
    private Long id;

    @ExcelProperty("退货单编号")
    @ExcelMergeGroup(unique = true)
    private String code;

    @ExcelProperty("退货时间")
    @ExcelMergeGroup
    private LocalDateTime returnTime;

    @ExcelProperty("创建人")
    @ExcelMergeGroup
    private String creator;

    @ExcelProperty("创建时间")
    @ExcelMergeGroup
    private LocalDateTime createTime;

    @ExcelProperty("更新人")
    @ExcelMergeGroup
    private String updater;

    @ExcelProperty("更新时间")
    @ExcelMergeGroup
    private LocalDateTime updateTime;

    @ExcelProperty("备注")
    @ExcelMergeGroup
    private String remark;

    @ExcelProperty(value = "审批状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.AUDIT_STATUS)
    @ExcelMergeGroup
    private Integer auditStatus;

    @ExcelProperty("审核者姓名")
    @ExcelMergeGroup
    private String auditorName;

    @ExcelProperty("审核时间")
    @ExcelMergeGroup
    private LocalDateTime auditTime;

    @ExcelProperty("审核意见")
    @ExcelMergeGroup
    private String auditAdvice;

    @ExcelProperty("供应商名称")
    @ExcelMergeGroup
    private String supplierName;

    @ExcelProperty("结算账户名称")
    @ExcelMergeGroup
    private String accountName;

    @ExcelProperty("币种名称")
    @ExcelMergeGroup
    private String currencyName;

    @ExcelProperty("合计数量")
    @ExcelMergeGroup
    private BigDecimal totalCount;

    @ExcelProperty("合计产品价格")
    @ExcelMergeGroup
    private BigDecimal totalProductPrice;

    @ExcelProperty("合计税额")
    @ExcelMergeGroup
    private BigDecimal totalGrossPrice;

    @ExcelProperty("价税合计")
    @ExcelMergeGroup
    private BigDecimal grossTotalPrice;

    @ExcelProperty("最终合计价格")
    @ExcelMergeGroup
    private BigDecimal totalPrice;

    @ExcelProperty("优惠率")
    @ExcelMergeGroup
    private BigDecimal discountPercent;

    @ExcelProperty("优惠金额")
    @ExcelMergeGroup
    private BigDecimal discountPrice;

    @ExcelProperty("其他费用")
    @ExcelMergeGroup
    private BigDecimal otherPrice;

//    @ExcelProperty(value = "退款状态", converter = DictConvert.class)
//    @DictFormat(SrmDictTypeConstants.PAYMENT_STATUS)
//    @ExcelMergeGroup
//    private Integer refundStatus;
//
//    @ExcelProperty("已退款金额")
//    @ExcelMergeGroup
//    private BigDecimal refundPrice;

    @ExcelProperty(value = "出库状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.OUTBOUND_STATUS)
    @ExcelMergeGroup
    private Integer outboundStatus;

    @ExcelProperty("总毛重")
    @ExcelMergeGroup
    private BigDecimal totalWeight;

    @ExcelProperty("总体积")
    @ExcelMergeGroup
    private BigDecimal totalVolume;

    // ========== 子表字段 ==========
    @ExcelProperty("退货项编号")
    private Long itemId;

    @ExcelProperty("入库单编号")
    private String arriveCode;

    @ExcelProperty("产品名称")
    private String productName;

    @ExcelProperty("产品SKU")
    private String productCode;

    @ExcelProperty("报关品名")
    private String declaredType;

    @ExcelProperty("报关品名英文")
    private String declaredTypeEn;

    @ExcelProperty("产品单位名称")
    private String productUnitName;

    @ExcelProperty("仓库名称")
    private String itemWarehouseName;

    @ExcelProperty("产品数量")
    private BigDecimal qty;

    @ExcelProperty("仓库产品可售库存")
    private BigDecimal sellableQty;

    @ExcelProperty("实际入库数量")
    private BigDecimal actualQty;

    @ExcelProperty("产品单价")
    private BigDecimal productPrice;

    @ExcelProperty("含税单价")
    private BigDecimal grossPrice;

    @ExcelProperty("税率")
    private BigDecimal taxRate;

    @ExcelProperty("税额")
    private BigDecimal tax;

    @ExcelProperty("总价")
    private BigDecimal itemTotalPrice;

    @ExcelProperty("价税合计")
    private BigDecimal grossTotalPriceItem;

    @ExcelProperty("申请人姓名")
    private String applicantName;

    @ExcelProperty("申请部门名称")
    private String applicationDeptName;

    @ExcelProperty(value = "出库状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.OUTBOUND_STATUS)
    private Integer itemOutboundStatus;

    @ExcelProperty("退货项备注")
    private String itemRemark;

    @ExcelProperty("箱率")
    private String containerRate;

    @ExcelProperty("退货项创建人")
    private String itemCreator;

    @ExcelProperty("退货项创建时间")
    private LocalDateTime itemCreateTime;

    @ExcelProperty("退货项更新人")
    private String itemUpdater;

    @ExcelProperty("退货项更新时间")
    private LocalDateTime itemUpdateTime;
} 