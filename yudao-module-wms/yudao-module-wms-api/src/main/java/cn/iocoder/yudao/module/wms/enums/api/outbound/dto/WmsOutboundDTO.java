package cn.iocoder.yudao.module.wms.enums.api.outbound.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


@Data

@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WmsOutboundDTO {

    /**
     * 仓库ID
     */
    private Long warehouseId;

    /**
     * 类型
     */
    private Integer type;

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
     * 库存归属部门ID
     */
    private Long deptId;

    /**
     * 出库时间
     */
    private LocalDateTime outboundTime;

    /**
     * 出库动作ID，与flow关联
     */
    private Long latestOutboundActionId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 单据号
     */
    private String code;

    /**
     * 来源单据ID
     */
    private Long upstreamBillId;

    /**
     * 来源单据号
     */
    private String upstreamBillCode;

    /**
     * WMS来源单据类型 ; WmsBillType : 0-入库单 , 1-出库单 , 2-盘点单
     */
    private Integer upstreamBillType;
}
