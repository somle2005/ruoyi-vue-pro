package cn.iocoder.yudao.module.tms.controller.admin.fee.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.tms.enums.TmsDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TmsFeeExcelRespVO {
    @ExcelProperty("头程单编码")
    @ExcelMergeGroup(unique = true)
    private String no;

    @ExcelProperty(value = "费用类型", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.TMS_FEE_TYPE)
    @ExcelMergeGroup
    private Integer costType;

    @ExcelProperty("金额")
    @ExcelMergeGroup
    private BigDecimal amount;

    @ExcelProperty(value = "币种", converter = DictConvert.class)
    @ExcelMergeGroup
    @DictFormat(TmsDictTypeConstants.CURRENCY_CODE)
    private Integer currencyType;

    @ExcelProperty("费用备注")
    @ExcelMergeGroup
    private String remark;
} 