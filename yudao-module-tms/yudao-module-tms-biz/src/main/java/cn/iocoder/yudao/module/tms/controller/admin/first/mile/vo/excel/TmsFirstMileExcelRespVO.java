package cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.excel;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.tms.enums.TmsDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TmsFirstMileExcelRespVO {
    // ========== 主表字段 ==========
    @ExcelProperty("编码")
    @ExcelMergeGroup(unique = true)
    private String code;

    @ExcelProperty("创建时间")
    @ExcelMergeGroup
    private LocalDateTime createTime;

    @ExcelProperty("单据日期")
    @ExcelMergeGroup
    private LocalDateTime billTime;

    @ExcelProperty("物流商ID")
    @ExcelMergeGroup
    private String carrierId;

    @ExcelProperty("结算日期")
    @ExcelMergeGroup
    private LocalDateTime settlementDate;

    @ExcelProperty("应付款余额")
    @ExcelMergeGroup
    private BigDecimal balance;

    @ExcelProperty("审核人名称")
    @ExcelMergeGroup
    private String auditorName;

    @ExcelProperty("审核时间")
    @ExcelMergeGroup
    private LocalDateTime auditTime;

    @ExcelProperty(value = "审核状态", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.AUDIT_STATUS)
    @ExcelMergeGroup
    private Integer auditStatus;

    @ExcelProperty("目的仓名称")
    @ExcelMergeGroup
    private String toWarehouseName;

    @ExcelProperty(value = "柜型", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.TMS_CABINET_TYPE)
    @ExcelMergeGroup
    private Integer cabinetType;

    @ExcelProperty("装柜日期")
    @ExcelMergeGroup
    private LocalDateTime packTime;

    @ExcelProperty("预计到货日期")
    @ExcelMergeGroup
    private LocalDateTime arrivePlanTime;

    @ExcelProperty("总货柜体积（mm³）")
    @ExcelMergeGroup
    private BigDecimal totalVolume;

    @ExcelProperty("总货柜毛重（kg）")
    @ExcelMergeGroup
    private BigDecimal totalPackageWeight;

    @ExcelProperty("总货柜净重（kg）")
    @ExcelMergeGroup
    private BigDecimal netWeight;

    @ExcelProperty("总货柜货值（按最近采购价）")
    @ExcelMergeGroup
    private BigDecimal totalValue;

    @ExcelProperty("总货柜件数")
    @ExcelMergeGroup
    private Integer totalQty;

    @ExcelProperty("总箱数")
    @ExcelMergeGroup
    private Integer totalBoxQty;

    @ExcelProperty("发货状态")
    @ExcelMergeGroup
    private Integer outboundStatus;

    @ExcelProperty("出库时间")
    @ExcelMergeGroup
    private LocalDateTime outboundTime;

    @ExcelProperty("入库状态")
    @ExcelMergeGroup
    private Integer inboundStatus;

    @ExcelProperty("入库时间")
    @ExcelMergeGroup
    private LocalDateTime inboundTime;

    @ExcelProperty("出口公司简称")
    @ExcelMergeGroup
    private String exportCompanyShortName;

    @ExcelProperty("中转公司简称")
    @ExcelMergeGroup
    private String transitCompanyShortName;

    // ========== 子表字段 ==========
    @ExcelProperty("明细行编号")
    private Long itemId;

    @ExcelProperty("申请单编码")
    private String requestCode;

    @ExcelProperty("件数")
    private Integer qty;

    @ExcelProperty("箱数")
    private Integer boxQty;

    @ExcelProperty("库存公司名称")
    private String companyName;

    @ExcelProperty("库存归属部门名称")
    private String deptName;

    @ExcelProperty("备注")
    private String itemRemark;

    @ExcelProperty("实际发货数")
    private Integer outboundClosedQty;

    @ExcelProperty("计划发货数")
    private Integer outboundPlanQty;

    @ExcelProperty("已入库数量")
    private Integer inboundClosedQty;

    @ExcelProperty("发出仓名称")
    private String fromWarehouseName;

    @ExcelProperty("总包装长（mm）")
    private BigDecimal totalPackageLength;

    @ExcelProperty("总包装宽（mm）")
    private BigDecimal totalPackageWidth;

    @ExcelProperty("总包装高（mm）")
    private BigDecimal totalPackageHeight;

    @ExcelProperty("总毛重（kg）")
    private BigDecimal totalItemPackageWeight;

    @ExcelProperty("总体积（m³）")
    private BigDecimal totalItemVolume;

    @ExcelProperty("销售公司名称")
    private String salesCompanyName;
} 