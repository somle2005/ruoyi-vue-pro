package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.request.resp;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.srm.enums.SrmDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author: wdy
 */
@Data
public class SrmPurchaseRequestExcelRespVO {

    @ExcelProperty("单据编号")
    private String code;

    @ExcelProperty("申请人")
    private String applicant;

    @ExcelProperty("申请部门")
    private String applicationDept;

    @ExcelProperty("单据日期")
    private LocalDateTime billTime;
    // ========== 审核信息 ==========
    @ExcelProperty("审核者")
    private String auditor;

    @ExcelProperty("审核时间")
    private LocalDateTime auditTime;

    @ExcelProperty("产品信息")
    private String productNames;

    @ExcelProperty("产品总数")
    private Integer totalCount;

    // ========== 申请单创建和更新 ==========
    @ExcelProperty("制单时间")
    private LocalDateTime createTime;

    // ========== 申请单计算 ==========
    // ========== 状态 ==========
    @ExcelProperty(value = "审核状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.AUDIT_STATUS)
    private Integer auditStatus;

    @ExcelProperty(value = "关闭状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.OFF_STATUS)
    private Integer offStatus;

    @ExcelProperty(value = "订购状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.ORDER_STATUS)
    private Integer orderStatus;

    @ExcelProperty(value = "主表关闭状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.OFF_STATUS)
    private Integer lineOffStatus;

    @ExcelProperty(value = "主表订购状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.ORDER_STATUS)
    private Integer lineOrderStatus;

    @ExcelProperty("收获地址")
    private String delivery;

    @ExcelProperty("供应商名称")
    private String supplierName;

    @ExcelProperty("审核意见")
    private String auditAdvice;

    @ExcelProperty("定金金额")
    private BigDecimal depositPrice;

    @ExcelProperty("优惠率")
    private BigDecimal discountPercent;

    private String fileUrl;

    @ExcelProperty("备注")
    private String remark;
    // ========== 订单项列表 ==========

    @Schema(description = "订单项编号")
    @ExcelProperty("订单项编号")
    private Long id;

    @Schema(description = "产品编号")
    @ExcelProperty("产品编号")
    private Long productId;

    @Schema(description = "产品报关品名")
    private String declaredType;

    @Schema(description = "报关品名英文")
    private String declaredTypeEn;

    @Schema(description = "产品sku")
    private String productCode;

    @Schema(description = "产品名称")
    @ExcelProperty("产品名称")
    private String productName;

    @Schema(description = "产品单位名称")
    @ExcelProperty("产品单位名称")
    private String productUnitName;

    @Schema(description = "产品单位ID")
    @ExcelProperty("产品单位ID")
    private Long productUnitId;

    @Schema(description = "仓库id")
    private Long warehouseId;

    @Schema(description = "仓库名称")
    @ExcelProperty("仓库名称")
    private String warehouseName;

    // ========== 数量与价格 ==========

    @Schema(description = "产品数量")
    @NotNull(message = "产品数量不能为空")
    @ExcelProperty("产品数量")
    private Integer qty;

    @Schema(description = "参考单价")
    @ExcelProperty("参考单价")
    private BigDecimal referenceUnitPrice;

    @Schema(description = "含税单价")
    @ExcelProperty("含税单价")
    private BigDecimal grossPrice;

    @Schema(description = "价税合计")
    @ExcelProperty("价税合计")
    private BigDecimal grossTotalPrice;

    @Schema(description = "税额，单位：元")
    @ExcelProperty("税额")
    private BigDecimal tax;

    @Schema(description = "税率，百分比")
    @ExcelProperty("税率")
    private BigDecimal taxRate;

    @Schema(description = "批准数量")
    @ExcelProperty("批准数量")
    private Integer approvedQty;

    // ========== 其他状态信息 ==========
    @Schema(description = "未订购数量")
    @ExcelProperty("未订购数量")
    private Integer unOrderCount;

    @Schema(description = "已订购数量")
    private Integer orderClosedQty;

    @Schema(description = "已入库数量")
    @ExcelProperty("已入库数量")
    private Integer inboundClosedQty;

    @Schema(description = "期望到货日期")
    private LocalDateTime expectArrivalDate;
}
