package cn.iocoder.yudao.module.tms.controller.admin.logistic.category.product.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.tms.enums.TmsDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TmsCustomProductExcelRespVO {
    @ExcelProperty("海关产品分类编号")
    @ExcelMergeGroup(unique = true)
    private Long id;

    @ExcelProperty("产品编号")
    @ExcelMergeGroup
    private Long productId;

    @ExcelProperty("产品名称")
    @ExcelMergeGroup
    private String productName;

    @ExcelProperty("产品编码")
    @ExcelMergeGroup
    private String productCode;

    @ExcelProperty("海关分类编号")
    @ExcelMergeGroup
    private Long customCategoryId;

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
} 