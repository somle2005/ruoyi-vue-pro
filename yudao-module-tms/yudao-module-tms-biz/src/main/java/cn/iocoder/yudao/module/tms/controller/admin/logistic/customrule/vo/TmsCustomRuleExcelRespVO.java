package cn.iocoder.yudao.module.tms.controller.admin.logistic.customrule.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.tms.enums.TmsDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TmsCustomRuleExcelRespVO {
    // ========== 主表字段 ==========
    @ExcelProperty("海关规则编号")
    @ExcelMergeGroup(unique = true)
    private Long id;

    @ExcelProperty(value = "国家编码", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.COUNTRY_CODE)
    @ExcelMergeGroup
    private Integer countryCode;

    @ExcelProperty("产品编号")
    @ExcelMergeGroup
    private Long productId;

    @ExcelProperty("产品名称")
    @ExcelMergeGroup
    private String productName;

    @ExcelProperty("产品编码")
    @ExcelMergeGroup
    private String productCode;

    @ExcelProperty("申报品名（英文）")
    @ExcelMergeGroup
    private String declaredTypeEn;

    @ExcelProperty("申报品名")
    @ExcelMergeGroup
    private String declaredType;

    @ExcelProperty("申报金额")
    @ExcelMergeGroup
    private Double declaredValue;

    @ExcelProperty(value = "申报金额币种", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.CURRENCY_CODE)
    @ExcelMergeGroup
    private Integer declaredValueCurrencyCode;

    @ExcelProperty(value = "物流属性", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.ERP_LOGISTIC_ATTRIBUTE)
    @ExcelMergeGroup
    private Integer logisticAttribute;

    @ExcelProperty("条形码")
    @ExcelMergeGroup
    private String fbaBarCode;

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

    // ========== 子表字段（海关分类子表） ==========
    @ExcelProperty("子项行编号")
    private Long categoryItemId;

    @ExcelProperty("HS编码")
    private String hscode;

    @ExcelProperty("税率")
    private BigDecimal taxRate;

    @ExcelProperty(value = "材质", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.ERP_PRODUCT_MATERIAL)
    private Integer material;

    @ExcelProperty("报关材质描述")
    private String customsMaterial;

    @ExcelProperty("用途描述")
    private String customsPurpose;

    @ExcelProperty("材质+报关品名")
    private String combinedValue;
} 