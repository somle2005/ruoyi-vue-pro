package cn.iocoder.yudao.module.srm.controller.admin.purchase.payment.term.vo;

import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SrmPaymentTermExcelRespVO {
    @ExcelProperty("编号")
    @ExcelMergeGroup(unique = true)
    private Long id;

    @ExcelProperty("创建时间")
    @ExcelMergeGroup
    private LocalDateTime createTime;

    @ExcelProperty("人民币采购条款（中文）")
    @ExcelMergeGroup
    private String paymentTermZh;

    @ExcelProperty("外币采购条款（中文）")
    @ExcelMergeGroup
    private String paymentTermZhForeign;

    @ExcelProperty("外币采购条款（英文）")
    @ExcelMergeGroup
    private String paymentTermEnForeign;

    @ExcelProperty("备注")
    @ExcelMergeGroup
    private String remark;
} 