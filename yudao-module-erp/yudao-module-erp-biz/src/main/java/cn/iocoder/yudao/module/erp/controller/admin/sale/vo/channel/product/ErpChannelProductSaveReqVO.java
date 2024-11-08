package cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigDecimal;
import java.util.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - ERP 渠道平台产品新增/修改 Request VO")
@Data
public class ErpChannelProductSaveReqVO {

    @Schema(description = "渠道产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "22047")
    private Long id;

    @Schema(description = "渠道产品编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "渠道产品编码不能为空")
    private String code;

    @Schema(description = "渠道产品名称", example = "李四")
    private String name;

    @Schema(description = "渠道产品状态（1启用，0禁用）", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "渠道产品状态（1启用，0禁用）不能为空")
    private Boolean status;

    @Schema(description = "渠道编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "14526")
    @NotNull(message = "渠道编号不能为空")
    private Integer channelId;

    @Schema(description = "产品编号", example = "28174")
    private Integer productId;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "链接地址", example = "https://www.iocoder.cn")
    private String url;

    @Schema(description = "底价", requiredMode = Schema.RequiredMode.REQUIRED, example = "3897")
    @NotNull(message = "底价不能为空")
    private BigDecimal bottomPrice;

    @Schema(description = "负责人id", example = "16580")
    private String ownerId;

}