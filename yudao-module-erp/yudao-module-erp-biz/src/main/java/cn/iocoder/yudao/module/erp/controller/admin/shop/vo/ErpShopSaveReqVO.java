package cn.iocoder.yudao.module.erp.controller.admin.shop.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.somle.framework.common.model.ValidationGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - ERP 店铺新增/修改 Request VO")
@Data
public class ErpShopSaveReqVO {

    @Schema(description = "店铺编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "27401")
    private Long id;

    @Schema(description = "店铺名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "王五")
    @NotEmpty(message = "店铺名称不能为空")
    private String name;

    @Schema(description = "店铺域名", example = "www.xxx.com")
    @NotEmpty(message = "店铺域名")
    private String domainName;

    @Schema(description = "店铺编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "店铺编码不能为空")
    private String code;

    @Schema(description = "国家代码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("国家代码")
    private String countryCode;

    @Schema(description = "备注", example = "你猜")
    private String remark;

    @Schema(description = "开启状态", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "开启状态不能为空")
    private Integer status;

    @Schema(description = "排序")
    private Integer sort;

    @Schema(description = "类型 0线上 1线上", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "类型 0线上 1线上不能为空")
    private Integer type;

    @Schema(description = "平台账户", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "平台账户，不能为空")
    private String account;

    @Schema(description = "销售平台", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "销售平台，不能为空")
    private String platform;

    @Schema(description = "销售平台店铺唯一ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "销售平台，不能为空",groups = {ValidationGroup.create.class})
    private String platformShopUid;

}