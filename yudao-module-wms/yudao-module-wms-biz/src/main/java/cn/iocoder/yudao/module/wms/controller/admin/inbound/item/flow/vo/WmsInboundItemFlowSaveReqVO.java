package cn.iocoder.yudao.module.wms.controller.admin.inbound.item.flow.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;

/**
 * @table-fields : inbound_id,bill_id,outbound_available_delta_qty,outbound_available_qty,outbound_action_id,bill_item_id,product_id,bill_type,id,inbound_item_id,direction
 */
@Schema(description = "管理后台 - 入库单库存详情扣减新增/修改 Request VO")
@Data
public class WmsInboundItemFlowSaveReqVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "13478")
    private Long id;

    @Schema(description = "入库单ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "23778")
    @NotNull(message = "入库单ID不能为空")
    private Long inboundId;

    @Schema(description = "入库单明细ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "25263")
    @NotNull(message = "入库单明细ID不能为空")
    private Long inboundItemId;

    @Schema(description = "标准产品ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "30952")
    @NotNull(message = "标准产品ID不能为空")
    private Long productId;

    @Schema(description = "出库动作ID", example = "")
    private Long outboundActionId;

    @Schema(description = "单据类型", example = "")
    private Integer billType;

    @Schema(description = "出库单ID", example = "")
    private Long billId;

    @Schema(description = "出库单明细ID", example = "")
    private Long billItemId;

    @Schema(description = "出入方向", example = "")
    private Integer direction;

    @Schema(description = "变化的数量，可出库量的变化量", example = "")
    private Integer outboundAvailableDeltaQty;

    @Schema(description = "可出库量", example = "")
    private Integer outboundAvailableQty;
}
