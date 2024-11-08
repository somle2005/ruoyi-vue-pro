package cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @className: ErpChannelSimpleRespVO
 * @author: Wqh
 * @date: 2024/11/6 14:04
 * @Version: 1.0
 * @description:
 */
@Data
public class ErpChannelSimpleRespVO {
    @Schema(description = "渠道编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    private Long id;

    @Schema(description = "渠道名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "芋道")
    private String name;

    @Schema(description = "父渠道 ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    private Long parentId;
}
