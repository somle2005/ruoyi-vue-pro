package cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
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
public class ErpCustomCategoryExportExcelVO {
    @ExcelProperty("错误信息")
    private String msg;

    @ExcelProperty("材质-字典")
    private String materialStr;

    @ExcelProperty("报关品名")
    private String declaredType;

    @ExcelProperty("英文品名")
    @Schema(description = "英文品名")
    private String declaredTypeEn;

    @ExcelProperty("国家-字典")
    private String countryCodeStr;

    @ExcelProperty("HS编码")
    private String hsCode;

    @ExcelProperty("税率")
    private BigDecimal taxRate;
}
