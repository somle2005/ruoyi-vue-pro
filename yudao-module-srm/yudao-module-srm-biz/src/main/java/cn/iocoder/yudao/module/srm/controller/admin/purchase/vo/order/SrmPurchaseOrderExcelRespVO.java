package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.order;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.srm.enums.SrmDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class SrmPurchaseOrderExcelRespVO {
    // ========== 主表字段 ==========
    @ExcelProperty("采购订单编号")
    @ExcelMergeGroup(unique = true)
    private String code;

    @ExcelProperty("供应商名称")
    @ExcelMergeGroup
    private String supplierName;

    @ExcelProperty("单据日期")
    @ExcelMergeGroup
    private LocalDateTime billTime;

    @ExcelProperty("采购时间")
    @ExcelMergeGroup
    private LocalDateTime orderTime;

    @ExcelProperty("交货日期")
    @ExcelMergeGroup
    private LocalDateTime deliveryDate;

    @ExcelProperty("结算日期")
    @ExcelMergeGroup
    private LocalDateTime settlementDate;

    @ExcelProperty("收获地址")
    @ExcelMergeGroup
    private String address;

    @ExcelProperty("审核人名称")
    @ExcelMergeGroup
    private String auditor;

    @ExcelProperty("审核时间")
    @ExcelMergeGroup
    private LocalDateTime auditTime;

    @ExcelProperty("审核意见")
    @ExcelMergeGroup
    private String auditAdvice;

    @ExcelProperty(value = "审核状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.AUDIT_STATUS)
    @ExcelMergeGroup
    private Integer auditStatus;

    @ExcelProperty(value = "开关状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.OFF_STATUS)
    @ExcelMergeGroup
    private Integer offStatus;

    @ExcelProperty(value = "执行状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.EXECUTE_STATUS)
    @ExcelMergeGroup
    private Integer executeStatus;

    @ExcelProperty(value = "入库状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.STORAGE_STATUS)
    @ExcelMergeGroup
    private Integer inboundStatus;

    @ExcelProperty(value = "付款状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.PAYMENT_STATUS)
    @ExcelMergeGroup
    private Integer payStatus;

    @ExcelProperty("优惠率，百分比")
    @ExcelMergeGroup
    private BigDecimal discountPercent;

    @ExcelProperty("优惠金额，单位：元")
    @ExcelMergeGroup
    private BigDecimal discountPrice;

    @ExcelProperty("定金金额，单位：元")
    @ExcelMergeGroup
    private BigDecimal depositPrice;

    @ExcelProperty("合计数量-项目数量")
    @ExcelMergeGroup
    private BigDecimal totalCount;

    @ExcelProperty("最终合计价格，单位：元")
    @ExcelMergeGroup
    private BigDecimal totalPrice;

    @ExcelProperty("合计产品价格，单位：元")
    @ExcelMergeGroup
    private BigDecimal totalProductPrice;

    @ExcelProperty("合计税额，单位：元")
    @ExcelMergeGroup
    private BigDecimal totalGrossPrice;

    @ExcelProperty("订单采购入库数量")
    @ExcelMergeGroup
    private BigDecimal totalInboundCount;

    @ExcelProperty("订单采购退货数量")
    @ExcelMergeGroup
    private BigDecimal totalReturnCount;

    @ExcelProperty("备注")
    @ExcelMergeGroup
    private String remark;

    @ExcelProperty("付款条款")
    @ExcelMergeGroup
    private String paymentTerms;

    @ExcelProperty("币别名称")
    @ExcelMergeGroup
    private String currencyName;

    @ExcelProperty("装运港")
    @ExcelMergeGroup
    private String fromPortName;

    @ExcelProperty("目的港")
    @ExcelMergeGroup
    private String toPortName;

    // ========== 子表字段 ==========
    @ExcelProperty("订单项编号")
    private Long itemId;

    @ExcelProperty("产品名称")
    private String productName;

    @ExcelProperty("产品sku")
    private String productCode;

    @ExcelProperty("产品单位名称")
    private String productUnitName;

    @ExcelProperty("型号规格型号")
    private String model;

    @ExcelProperty("x码")
    private String fbaCode;

    @ExcelProperty("箱率")
    private String containerRate;

    @ExcelProperty("产品报关品名")
    private String declaredType;

    @ExcelProperty("报关品名英文")
    private String declaredTypeEn;

    @ExcelProperty("报关品名-产品(产品的品牌)")
    private String customsDeclaration;

    @ExcelProperty("产品下单数量")
    private BigDecimal qty;

    @ExcelProperty("产品单价")
    private BigDecimal productPrice;

    @ExcelProperty("含税单价")
    private BigDecimal grossPrice;

    @ExcelProperty("税率，百分比")
    private BigDecimal taxRate;

    @ExcelProperty("税额，单位：元")
    private BigDecimal tax;

    @ExcelProperty("价税合计")
    private BigDecimal grossTotalPrice;

    @ExcelProperty("已付款金额")
    private BigDecimal payPrice;

    @ExcelProperty("待入库数量")
    private BigDecimal waitInCount;

    @ExcelProperty("采购入库数量")
    private BigDecimal inboundClosedQty;

    @ExcelProperty("采购退货数量")
    private BigDecimal returnCount;

    @ExcelProperty("产品存放仓库名称")
    private String warehouseName;

    @ExcelProperty("可用库存")
    private BigDecimal availableStock;

    @ExcelProperty(value = "关闭状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.OFF_STATUS)
    private Integer itemOffStatus;

    @ExcelProperty(value = "执行状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.EXECUTE_STATUS)
    private Integer itemExecuteStatus;

    @ExcelProperty(value = "入库状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.STORAGE_STATUS)
    private Integer itemInboundStatus;

    @ExcelProperty(value = "付款状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.PAYMENT_STATUS)
    private Integer itemPayStatus;

    @ExcelProperty("原单单号（采购申请单code）")
    private String purchaseApplyCode;

    @ExcelProperty("交货日期")
    private LocalDateTime deliveryTime;

    @ExcelProperty("申请人名称")
    private String applicantName;

    @ExcelProperty("部门名称")
    private String departmentName;

    @ExcelProperty("商品行备注")
    private String itemRemark;

    @ExcelProperty("供应商付款条款")
    private String supplierRule;

    @ExcelProperty("总验货通过数量")
    private Integer totalInspectionPassCount;

    @ExcelProperty("总完工单通过数量")
    private Integer totalCompletionPassCount;

} 