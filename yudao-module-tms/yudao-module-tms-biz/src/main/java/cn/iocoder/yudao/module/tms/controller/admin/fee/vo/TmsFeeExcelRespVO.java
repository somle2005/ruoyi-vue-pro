package cn.iocoder.yudao.module.tms.controller.admin.fee.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.tms.enums.TmsDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TmsFeeExcelRespVO {
    @ExcelProperty("主键ID")
    private Long id;

    @ExcelProperty("原单类型")
    private Integer upstreamType;

    @ExcelProperty("原单ID")
    private Long upstreamId;

    @ExcelProperty(value = "费用类型", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.TMS_FEE_TYPE)
    private Integer costType;

    @ExcelProperty("金额")
    private BigDecimal amount;

    @ExcelProperty("币种")
    private Integer currencyType;

    @ExcelProperty("备注")
    private String remark;
} 