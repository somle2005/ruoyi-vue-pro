package cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @className: ErpChannelListReqVO
 * @author: Wqh
 * @date: 2024/11/6 14:05
 * @Version: 1.0
 * @description:
 */
@Data
public class ErpChannelListReqVO {
    @Schema(description = "渠道名称，模糊匹配", example = "芋道")
    private String name;

    @Schema(description = "展示状态，参见 CommonStatusEnum 枚举类", example = "1")
    private Boolean status;

}
