package cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo;

import cn.iocoder.yudao.framework.common.enums.enums.DictTypeConstants;
import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = false)
public class ErpCustomCategoryImportExcelVO {

    @DictFormat("erp_product_material")
    @ExcelProperty(value = "材质", converter = DictConvert.class)
    private Integer material;

    @ExcelProperty("报关品名")
    private String declaredType;

    @ExcelProperty("英文品名")
    private String declaredTypeEn;

    @ExcelProperty(value = "国家", converter = DictConvert.class)
    @DictFormat(DictTypeConstants.COUNTRY_CODE)
    private Integer countryCode;

    @ExcelProperty("HS编码")
    private String hsCode;

    @ExcelProperty("税率")
    private BigDecimal taxRate;
}
