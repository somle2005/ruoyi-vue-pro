package cn.iocoder.yudao.module.tms.controller.admin.common.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class TmsProductRespVO {

    @Schema(description = "产品id")
    private Long productId;

    @Schema(description = "产品名称")
    private String productName;

    @Schema(description = "产品sku")
    private String barCode;
}
