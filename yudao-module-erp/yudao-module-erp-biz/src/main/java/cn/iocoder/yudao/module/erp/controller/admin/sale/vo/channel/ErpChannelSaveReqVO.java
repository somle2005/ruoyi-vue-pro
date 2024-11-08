package cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - ERP 渠道新增/修改 Request VO")
@Data
public class ErpChannelSaveReqVO {

    @Schema(description = "渠道编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "3908")
    private Long id;

    @Schema(description = "渠道编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "渠道编码不能为空")
    private String code;

    @Schema(description = "渠道名称", example = "王五")
    private String name;

    @Schema(description = "渠道状态（1启用，0禁用）", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "渠道状态（1启用，0禁用）不能为空")
    private Boolean status;

    @Schema(description = "父渠道编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "31780")
    @NotNull(message = "父渠道编号不能为空")
    private Long parentId;

}