package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.system.enums.DictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SrmSupplierExcelRespVO {
    @ExcelProperty("供应商编号")
    @ExcelMergeGroup(unique = true)
    private Long id;

    @ExcelProperty("供应商名称")
    @ExcelMergeGroup
    private String name;

    @ExcelProperty("供应商简称")
    @ExcelMergeGroup
    private String shortName;

    @ExcelProperty("社会统一信用代码")
    @ExcelMergeGroup
    private String creditCode;

    @ExcelProperty("联系人")
    @ExcelMergeGroup
    private String contact;

    @ExcelProperty("联系电话")
    @ExcelMergeGroup
    private String contactPhone;

    @ExcelProperty("邮箱")
    @ExcelMergeGroup
    private String email;

    @ExcelProperty("地址")
    @ExcelMergeGroup
    private String address;

    @ExcelProperty("开户银行")
    @ExcelMergeGroup
    private String bankName;

    @ExcelProperty("银行账号")
    @ExcelMergeGroup
    private String bankAccount;

    @ExcelProperty("税号")
    @ExcelMergeGroup
    private String taxNo;

    @ExcelMergeGroup
    @ExcelProperty(value = "开启状态", converter = DictConvert.class)
    @DictFormat(DictTypeConstants.COMMON_STATUS)
    private Integer status;

    @ExcelProperty("创建人")
    @ExcelMergeGroup
    private String creator;

    @ExcelProperty("创建时间")
    @ExcelMergeGroup
    private LocalDateTime createTime;

    @ExcelProperty("备注")
    @ExcelMergeGroup
    private String remark;

    @ExcelProperty("付款条款-创建时间")
    @ExcelMergeGroup
    private LocalDateTime paymentTermCreateTime;

    @ExcelProperty("付款条款-人民币采购条款（中文）")
    @ExcelMergeGroup
    private String paymentTermZh;

    @ExcelProperty("付款条款-外币采购条款（中文）")
    @ExcelMergeGroup
    private String paymentTermZhForeign;

    @ExcelProperty("付款条款-外币采购条款（英文）")
    @ExcelMergeGroup
    private String paymentTermEnForeign;

    @ExcelProperty("付款条款-备注")
    @ExcelMergeGroup
    private String paymentTermRemark;
} 