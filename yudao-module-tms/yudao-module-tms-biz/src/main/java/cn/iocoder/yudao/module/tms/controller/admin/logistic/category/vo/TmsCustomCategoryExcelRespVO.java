package cn.iocoder.yudao.module.tms.controller.admin.logistic.category.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.tms.enums.TmsDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TmsCustomCategoryExcelRespVO {
    // ========== 主表字段 ==========
    @ExcelProperty("海关分类编号")
    @ExcelMergeGroup(unique = true)
    private Long id;

    @ExcelProperty(value = "材质", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.PRODUCT_MATERIAL)
    @ExcelMergeGroup
    private Integer material;

    @ExcelProperty("报关品名")
    @ExcelMergeGroup
    private String declaredType;

    @ExcelProperty("英文品名")
    @ExcelMergeGroup
    private String declaredTypeEn;

    @ExcelProperty("用途描述")
    @ExcelMergeGroup
    private String customsPurpose;

    @ExcelProperty("报关材质描述")
    @ExcelMergeGroup
    private String customsMaterial;

    @ExcelProperty("材质+报关品名")
    @ExcelMergeGroup
    private String combinedValue;

    @ExcelProperty("对应产品数量")
    @ExcelMergeGroup
    private Long productCount;

    @ExcelProperty("明细行个数")
    @ExcelMergeGroup
    private Integer itemCount;

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

    @ExcelProperty(value = "国家", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.COUNTRY_CODE)
    private Integer countryCode;

    @ExcelProperty("HS编码")
    private String hscode;

    @ExcelProperty("税率")
    private BigDecimal taxRate;
} 