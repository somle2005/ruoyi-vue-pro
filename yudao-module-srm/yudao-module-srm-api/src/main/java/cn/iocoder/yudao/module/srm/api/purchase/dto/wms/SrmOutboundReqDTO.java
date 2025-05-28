package cn.iocoder.yudao.module.srm.api.purchase.dto.wms;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Validated
public class SrmOutboundReqDTO {

    @NotNull(message = "SRM至WMS的出库单ID不能为null")
    private Long id;

    /**
     * 仓库ID
     */
    private Long warehouseId;

    /**
     * 审核状态
     */
    private Integer auditStatus;

    /**
     * 状态
     */
    private Integer outboundStatus;

    /**
     * 库存财务公司ID
     */
    private Long companyId;

    /**
     * 出库时间
     */
    private LocalDateTime outboundTime;
    /**
     * 来源单据ID
     */
    @NotNull(message = "SRM至WMS的出库单来源单据ID不能为空")
    private Long upstreamBillId;

    /**
     * 来源单据号
     */
    private String upstreamBillCode;

    /**
     * WMS来源单据类型 ;
     */
    private Integer upstreamBillType;

    /**
     * 出库单明细
     */
    @Size(min = 1, message = "SRM至WMS的出库单明细不能为空")
    private List<SrmOutboundItemReqDTO> items;
}
