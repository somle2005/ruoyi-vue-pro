package cn.iocoder.yudao.module.wms.controller.admin.inbound.item.flow.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @table-fields : inbound_id,bill_id,outbound_available_delta_qty,outbound_available_qty,outbound_action_id,bill_item_id,create_time,product_id,bill_type,inbound_item_id,direction
 */
@Schema(description = "管理后台 - 入库单库存详情扣减分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WmsInboundItemFlowPageReqVO extends PageParam {

    @Schema(description = "入库单ID", example = "23778")
    private Long inboundId;

    @Schema(description = "入库单明细ID", example = "25263")
    private Long inboundItemId;

    @Schema(description = "标准产品ID", example = "30952")
    private Long productId;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

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
