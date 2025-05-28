package cn.iocoder.yudao.module.srm.api.purchase.dto.wms;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class SrmOutboundItemReqDTO {

    @NotNull(message = "SRM至WMS的出库单明细ID不能为空")
    private Long id;

    /**
     * 入库单ID
     */
    private Long outboundId;

    /**
     * 标准产品ID
     */
    private Long productId;

    /**
     * 出库状态 ; OutboundStatus : 0-未出库 , 1-部分出库 , 2-已出库
     */
    @NotNull(message = "SRM至WMS的出库单明细出库状态不能为空")
    private Integer outboundStatus;

    /**
     * 出库库位ID
     */
    private Long binId;

    /**
     * 实际出库量
     */
    @NotNull(message = "SRM至WMS的出库单明细实际出库量不能为空")
    private Integer actualQty;

    /**
     * 计划出库量
     */
    private Integer planQty;

    /**
     * 库存财务公司ID
     */
    private Long companyId;

    /**
     * 库存归属部门ID
     */
    private Long deptId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 来源详情ID
     */
    @NotNull(message = "SRM至WMS的出库单明细来源详情ID不能为空")
    private Long upstreamItemId;
}
