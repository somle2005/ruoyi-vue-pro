package cn.iocoder.yudao.module.tms.api.transfer.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * 调拨入库单明细 DTO
 */
@Data
@Validated
public class TmsInboundItemReqDTO {

    /**
     * 主键
     */
    @NotNull(message = "调拨入库单明细主键不能为空")
    private Long id;

    /**
     * 仓库ID
     */
    private Long warehouseId;

    /**
     * 入库单明细ID
     */
    private Long inboundId;

    /**
     * 实际入库量
     */
    @NotNull(message = "调拨入库单明细实际入库量不能为空")
    private Integer actualQty;

    /**
     * 库龄
     */
    private Integer age;

    /**
     * 批次剩余库存，出库后的剩余库存量
     */
    private Integer outboundAvailableQty;

    /**
     * 计划入库量
     */
    private Integer planQty;

    /**
     * 已上架量，已经拣货到仓位的库存量
     */
    private Integer shelvedQty;

    /**
     * 上架可用量，已上架量 - 出库可用量
     */
    private Integer shelveAvailableQty;

    /**
     * 库存归属部门ID
     */
    private Long deptId;

    /**
     * 库存财务公司ID
     */
    private Long companyId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 来源详情ID
     */
    @NotNull(message = "调拨入库单明细上游ID不能为空")
    private Long upstreamItemId;
} 