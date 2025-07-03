package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.tms.enums.TmsDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TmsFirstMileRequestExcelRespVO {
    // ========== 主表字段 ==========
    @ExcelProperty("申请单编码")
    @ExcelMergeGroup(unique = true)
    private String code;

    @ExcelProperty("申请人名称")
    @ExcelMergeGroup
    private String requestUserName;

    @ExcelProperty("申请部门名称")
    @ExcelMergeGroup
    private String requestDeptName;

    @ExcelProperty("目的仓名称")
    @ExcelMergeGroup
    private String toWarehouseName;

    @ExcelProperty(value = "审核状态", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.AUDIT_STATUS)
    @ExcelMergeGroup
    private Integer auditStatus;

    @ExcelProperty(value = "订购状态", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.ORDER_STATUS)
    @ExcelMergeGroup
    private Integer orderStatus;

    @ExcelProperty(value = "关闭状态", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.OFF_STATUS)
    @ExcelMergeGroup
    private Integer offStatus;

    @ExcelProperty("总净重（kg）")
    @ExcelMergeGroup
    private BigDecimal totalWeight;

    @ExcelProperty("总毛重（kg）")
    @ExcelMergeGroup
    private BigDecimal totalPackageWeight;

    @ExcelProperty("总体积（mm³）")
    @ExcelMergeGroup
    private BigDecimal totalVolume;

    @ExcelProperty("明细数量")
    @ExcelMergeGroup
    private Integer itemCount;

    @ExcelProperty("备注")
    @ExcelMergeGroup
    private String remark;

    @ExcelProperty("创建时间")
    @ExcelMergeGroup
    private LocalDateTime createTime;

    @ExcelProperty("更新时间")
    @ExcelMergeGroup
    private LocalDateTime updateTime;

    @ExcelProperty("创建人")
    @ExcelMergeGroup
    private String creator;

    @ExcelProperty("更新人")
    @ExcelMergeGroup
    private String updater;

    // ========== 子表字段 ==========
    @ExcelProperty("明细编号")
    private Long itemId;

    @ExcelProperty("产品名称")
    private String productName;

    @ExcelProperty("产品编码")
    private String productCode;

    @ExcelProperty("FBA条码")
    private String fbaBarCode;

    @ExcelProperty("申请数量")
    private Integer qty;

    @ExcelProperty("国内仓库库存")
    private Integer domesticWarehouseStock;

    @ExcelProperty("采购在途数量")
    private Integer purchaseTransitQty;

    @ExcelProperty("包装长（mm）")
    private BigDecimal packageLength;

    @ExcelProperty("包装宽（mm）")
    private BigDecimal packageWidth;

    @ExcelProperty("包装高（mm）")
    private BigDecimal packageHeight;

    @ExcelProperty("毛重（kg）")
    private BigDecimal packageWeight;

    @ExcelProperty("净重（kg）")
    private BigDecimal weight;

    @ExcelProperty("体积（mm³）")
    private BigDecimal volume;

    @ExcelProperty("总包装长（mm）")
    private BigDecimal totalPackageLength;

    @ExcelProperty("总包装宽（mm）")
    private BigDecimal totalPackageWidth;

    @ExcelProperty("总包装高（mm）")
    private BigDecimal totalPackageHeight;

    @ExcelProperty("总毛重（kg）")
    private BigDecimal totalItemPackageWeight;

    @ExcelProperty("总净重（kg）")
    private BigDecimal totalItemWeight;

    @ExcelProperty("总体积（mm³）")
    private BigDecimal totalItemVolume;

    @ExcelProperty(value = "明细订购状态", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.ORDER_STATUS)
    private Integer itemOrderStatus;

    @ExcelProperty(value = "明细关闭状态", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.OFF_STATUS)
    private Integer itemOffStatus;

    @ExcelProperty("已订购数")
    private Integer orderClosedQty;

    @ExcelProperty("销售公司名称")
    private String salesCompanyName;

    @ExcelProperty("明细备注")
    private String itemRemark;
} 