package cn.iocoder.yudao.module.tms.api.transfer.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 调拨入库单 DTO
 */
@Data
@Validated
public class TmsInboundReqDTO {

    /**
     * 主键
     */
    @NotNull(message = "调拨入库单主键ID不能为空")
    private Long id;

    /**
     * 单据号
     */
    private String code;

    /**
     * 仓库ID
     */
    private Long warehouseId;

    /**
     * 审核状态
     */
    private Integer auditStatus;

    /**
     * 入库状态
     */
    private Integer inboundStatus;

    /**
     * 库存财务公司ID
     */
    private Long companyId;

    /**
     * 入库时间
     */
    private LocalDateTime inboundTime;

    /**
     * 来源单据ID
     */
    @NotNull(message = "调拨入库单来源单据ID不能为空")
    private Long upstreamBillId;

    /**
     * 来源单据号
     */
    private String upstreamBillCode;

    /**
     * 来源单据类型
     */
    private Integer upstreamBillType;

    /**
     * 上架状态
     */
    private Integer shelvingStatus;

    /**
     * 入库单明细列表
     */
    @Size(min = 1, message = "调拨入库单明细列表至少有一个")
    private List<TmsInboundItemReqDTO> itemList;
} 