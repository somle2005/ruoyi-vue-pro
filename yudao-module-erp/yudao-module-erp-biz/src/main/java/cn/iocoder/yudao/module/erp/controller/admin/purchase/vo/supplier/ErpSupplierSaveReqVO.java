package cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.supplier;

import cn.iocoder.yudao.framework.common.enums.CommonStatusEnum;
import cn.iocoder.yudao.framework.common.validation.InEnum;
import cn.iocoder.yudao.framework.common.validation.Mobile;
import cn.iocoder.yudao.framework.common.validation.Telephone;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - ERP 供应商新增/修改 Request VO")
@Data
public class ErpSupplierSaveReqVO {

    @Schema(description = "供应商编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "15685")
    private Long id;

    @Schema(description = "供应商名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "芋艿")
    @NotEmpty(message = "供应商名称不能为空")
    private String name;

    @Schema(description = "联系人")
    private String contact;

    @Schema(description = "手机号码")
    private String mobile;

    @Schema(description = "联系电话")
    private String telephone;

    @Schema(description = "电子邮箱")
    private String email;

    @Schema(description = "传真")
    private String fax;

    @Schema(description = "备注", example = "随便")
    private String remark;

    @Schema(description = "开启状态", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "开启状态不能为空")
    private Integer status;

    @Schema(description = "排序", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "排序不能为空")
    private Integer sort;

    @Schema(description = "纳税人识别号")
    private String taxNo;

    @Schema(description = "税率")
    private BigDecimal taxPercent;

    @Schema(description = "开户行", example = "李四")
    private String bankName;

    @Schema(description = "开户账号", example = "9875")
    private String bankAccount;

    @Schema(description = "开户地址")
    private String bankAddress;

    @Schema(description = "付款条款id", requiredMode = Schema.RequiredMode.REQUIRED, example = "8394")
    @NotNull(message = "付款条款id不能为空")
    private Long paymentTermsId;

    @Schema(description = "公司地址", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "公司地址不能为空")
    private String companyAddress;

    @Schema(description = "文件送达地址", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "文件送达地址不能为空")
    private String serviceAddress;

}