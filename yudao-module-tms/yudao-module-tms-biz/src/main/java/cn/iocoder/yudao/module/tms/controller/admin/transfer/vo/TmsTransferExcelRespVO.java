package cn.iocoder.yudao.module.tms.controller.admin.transfer.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.tms.enums.TmsDictTypeConstants;
import cn.iocoder.yudao.module.wms.enums.WmsConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TmsTransferExcelRespVO {
    // ========== 主表字段 ==========
    @ExcelProperty("调拨单编码")
    @ExcelMergeGroup(unique = true)
    private String code;

    @ExcelProperty("发出仓库名称")
    @ExcelMergeGroup
    private String fromWarehouseName;

    @ExcelProperty("目的仓库名称")
    @ExcelMergeGroup
    private String toWarehouseName;

    @ExcelProperty("审核人姓名")
    @ExcelMergeGroup
    private String auditorName;

    @ExcelProperty(value = "审核状态", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.AUDIT_STATUS)
    @ExcelMergeGroup
    private Integer auditStatus;

    @ExcelProperty("审核时间")
    @ExcelMergeGroup
    private LocalDateTime auditTime;

    @ExcelProperty("审核意见")
    @ExcelMergeGroup
    private String auditAdvice;

    @ExcelProperty(value = "出库状态", converter = DictConvert.class)
    @DictFormat(WmsConstants.WMS_OUTBOUND_STATUS)
    @ExcelMergeGroup
    private Integer outboundStatus;

    @ExcelProperty("出库时间")
    @ExcelMergeGroup
    private LocalDateTime outboundTime;

    @ExcelProperty(value = "入库状态", converter = DictConvert.class)
    @DictFormat(WmsConstants.WMS_INBOUND_STATUS)
    @ExcelMergeGroup
    private Integer inboundStatus;

    @ExcelProperty("入库时间")
    @ExcelMergeGroup
    private LocalDateTime inboundTime;

    @ExcelProperty("备注")
    @ExcelMergeGroup
    private String remark;

    @ExcelProperty("跟踪号")
    @ExcelMergeGroup
    private String traceNo;

    @ExcelProperty("总货值")
    @ExcelMergeGroup
    private BigDecimal totalValue;

    @ExcelProperty("总净重")
    @ExcelMergeGroup
    private BigDecimal netWeight;

    @ExcelProperty("总毛重")
    @ExcelMergeGroup
    private BigDecimal totalWeight;

    @ExcelProperty("总体积")
    @ExcelMergeGroup
    private BigDecimal totalVolume;

    @ExcelProperty("总件数")
    @ExcelMergeGroup
    private Integer totalQty;

    @ExcelProperty("出库单编码")
    @ExcelMergeGroup
    private String outboundCode;

    @ExcelProperty("入库单编码")
    @ExcelMergeGroup
    private String inboundCode;

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

    @ExcelProperty("数量")
    private Integer qty;

    @ExcelProperty("可售库存")
    private Integer sellableQty;

    @ExcelProperty("箱数")
    private Integer boxQty;

    @ExcelProperty("包装重量（kg）")
    private BigDecimal packageWeight;

    @ExcelProperty("包装体积（m³）")
    private BigDecimal packageVolume;

    @ExcelProperty("库存公司名称")
    private String stockCompanyName;

    @ExcelProperty("明细备注")
    private String itemRemark;

    @ExcelProperty("实际发货数")
    private Integer outboundClosedQty;

    @ExcelProperty("已入库数")
    private Integer inboundClosedQty;

    @ExcelProperty("库存归属部门名称")
    private String deptName;
} 