package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.request.resp;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.framework.excel.core.convert.ImageListConverter;
import cn.iocoder.yudao.module.srm.enums.SrmDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.converters.bytearray.ByteArrayImageConverter;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: wdy
 */
@Data
public class SrmPurchaseRequestExcelRespVO {

    @ExcelProperty("单据编号")
    @ExcelMergeGroup(unique = true)
    private String code;

    @ExcelProperty("申请人")
    @ExcelMergeGroup
    private String applicant;

    @ExcelProperty("申请部门")
    @ExcelMergeGroup
    private String applicationDept;

    @ExcelProperty("单据日期")
    @ExcelMergeGroup
    private LocalDateTime billTime;
    // ========== 审核信息 ==========
    @ExcelProperty("审核者")
    @ExcelMergeGroup
    private String auditor;

    @ExcelProperty("审核时间")
    @ExcelMergeGroup
    private LocalDateTime auditTime;

    @ExcelProperty("产品总数")
    @ExcelMergeGroup
    private Integer totalCount;

    // ========== 申请单创建和更新 ==========
    @ExcelProperty("制单时间")
    @ExcelMergeGroup
    private LocalDateTime createTime;

    // ========== 申请单计算 ==========
    // ========== 状态 ==========
    @ExcelProperty(value = "审核状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.AUDIT_STATUS)
    @ExcelMergeGroup
    private Integer auditStatus;

    @ExcelProperty(value = "关闭状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.OFF_STATUS)
    @ExcelMergeGroup
    private Integer offStatus;

    @ExcelProperty(value = "订购状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.ORDER_STATUS)
    @ExcelMergeGroup
    private Integer orderStatus;

    @ExcelProperty("收获地址")
    @ExcelMergeGroup
    private String delivery;

    @ExcelProperty("供应商名称")
    @ExcelMergeGroup
    private String supplierName;

    @ExcelProperty("审核意见")
    @ExcelMergeGroup
    private String auditAdvice;

    @ExcelProperty("定金金额")
    @ExcelMergeGroup
    private BigDecimal depositPrice;

    @ExcelProperty("优惠率")
    @ExcelMergeGroup
    private BigDecimal discountPercent;

    @ExcelProperty("备注")
    @ExcelMergeGroup
    private String remark;
    // ========== 订单项列表 ==========

    @Schema(description = "订单项编号")
    @ExcelProperty("订单项编号")
    private Long id;

    @Schema(description = "产品编号")
    private Long productId;

    @Schema(hidden = true)
    @ExcelProperty(value = "主图", converter = ByteArrayImageConverter.class)
    private byte[] primaryImage;

    @Schema(hidden = true)
    @ExcelProperty(value = "副图", converter = ImageListConverter.class)
    private List<byte[]> secondaryImageList;

    @ExcelProperty("产品名称")
    private String productName;

    @ExcelProperty("产品单位名称")
    private String productUnitName;

    @ExcelProperty("产品sku")
    private String productCode;

    @Schema(description = "仓库名称")
    @ExcelProperty("仓库名称")
    private String warehouseName;

    @ExcelProperty("产品报关品名")
    private String declaredType;

    @ExcelProperty("报关品名英文")
    private String declaredTypeEn;
    // ========== 订单项状态 ==========

    @ExcelProperty(value = "行关闭状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.OFF_STATUS)
    private Integer lineOffStatus;

    @ExcelProperty(value = "行订购状态", converter = DictConvert.class)
    @DictFormat(SrmDictTypeConstants.ORDER_STATUS)
    private Integer lineOrderStatus;

    // ========== 数量与价格 ==========

    @NotNull(message = "产品数量不能为空")
    @ExcelProperty("产品数量")
    private Integer qty;

    @ExcelProperty("参考单价")
    private BigDecimal referenceUnitPrice;

    @ExcelProperty("含税单价")
    private BigDecimal grossPrice;

    @ExcelProperty("价税合计")
    private BigDecimal grossTotalPrice;

    @Schema(description = "税额，单位：元")
    @ExcelProperty("税额")
    private BigDecimal tax;

    @ExcelProperty("税率")
    private BigDecimal taxRate;

    @ExcelProperty("批准数量")
    private Integer approvedQty;

    // ========== 其他状态信息 ==========
    @ExcelProperty("未订购数量")
    private Integer unOrderCount;

    @ExcelProperty("已订购数量")
    private Integer orderClosedQty;

    @ExcelProperty("已入库数量")
    private Integer inboundClosedQty;

    @ExcelProperty("期望到货日期")
    private LocalDateTime expectArrivalDate;
}
