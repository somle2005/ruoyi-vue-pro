package cn.iocoder.yudao.module.tms.controller.admin.logistic.category.item.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.enums.enums.DictTypeConstants.COUNTRY_CODE;
import static cn.iocoder.yudao.framework.common.enums.enums.DictTypeConstants.PRODUCT_MATERIAL;

@Data
public class TmsCustomCategoryExportRow {

    @ExcelProperty("分类序号")
    private Long categoryId;

    @ExcelProperty(value = "材质", converter = DictConvert.class)
    @DictFormat(PRODUCT_MATERIAL)
    private Integer material;

    @ExcelProperty("报关品名")
    private String declaredType;

    @ExcelProperty("英文品名")
    private String declaredTypeEn;

    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    // 子项字段
    @ExcelProperty("子项序号")
    private Long itemId;

    @ExcelProperty(value = "国家", converter = DictConvert.class)
    @DictFormat(COUNTRY_CODE)
    private Integer countryCode;

    @ExcelProperty("HS编码")
    private String hscode;

    @ExcelProperty("税率")
    private BigDecimal taxRate;

    @ExcelProperty("子项创建时间")
    private LocalDateTime itemCreateTime;
}
