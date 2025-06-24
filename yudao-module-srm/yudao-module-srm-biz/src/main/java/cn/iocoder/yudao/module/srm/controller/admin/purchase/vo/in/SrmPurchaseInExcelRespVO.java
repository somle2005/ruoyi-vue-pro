package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.srm.enums.SrmDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class SrmPurchaseInExcelRespVO {
    // ========== 主表字段 ==========
    @ExcelProperty("到货单编号")
    @ExcelMergeGroup(unique = true)
    private String code;

    @ExcelProperty("供应商名称")
    @ExcelMergeGroup
    private String supplierName;

    @ExcelProperty("单据日期")
    @ExcelMergeGroup
    private LocalDateTime billTime;

    @ExcelProperty("到货时间")
    @ExcelMergeGroup
    private LocalDateTime inTime;

    @ExcelProperty("收货仓库")
    @ExcelMergeGroup
    private String warehouseName;

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


    @ExcelProperty(value = "入库状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.STORAGE_STATUS)
    @ExcelMergeGroup
    private Integer inboundStatus;

    @ExcelProperty("备注")
    @ExcelMergeGroup
    private String remark;

    @ExcelProperty("合计数量")
    @ExcelMergeGroup
    private BigDecimal totalCount;

    @ExcelProperty("合计金额")
    @ExcelMergeGroup
    private BigDecimal totalPrice;

    // ========== 子表字段 ==========
    @ExcelProperty("到货项编号")
    private Long itemId;

    @ExcelProperty("产品名称")
    private String productName;

    @ExcelProperty("产品sku")
    private String productCode;

    @ExcelProperty("产品单位名称")
    private String productUnitName;

    @ExcelProperty("型号")
    private String model;

    @ExcelProperty("到货数量")
    private BigDecimal qty;

    @ExcelProperty("含税单价")
    private BigDecimal grossPrice;

    @ExcelProperty("价税合计")
    private BigDecimal grossTotalPrice;

    @ExcelProperty("税率")
    private BigDecimal taxRate;

    @ExcelProperty("税额")
    private BigDecimal tax;

    @ExcelProperty("仓库名称")
    private String itemWarehouseName;

    @ExcelProperty(value = "入库状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.STORAGE_STATUS)
    private Integer itemInboundStatus;

    @ExcelProperty("采购订单编号")
    private String purchaseOrderCode;

    // ========== 申请人信息 ==========
    @ExcelProperty("申请人名称")
    private String applicantName;

    @ExcelProperty("申请部门名称")
    private String applicationDeptName;

    @ExcelProperty("商品行备注")
    private String itemRemark;
} 