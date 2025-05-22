package cn.iocoder.yudao.module.wms.api.outbound.dto;

import cn.iocoder.yudao.framework.common.validation.InEnum;
import cn.iocoder.yudao.framework.common.validation.ValidationGroup;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundStatus;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @table-fields : code,company_id,remark,audit_status,outbound_time,type,upstream_bill_type,latest_outbound_action_id,outbound_status,upstream_bill_id,id,upstream_bill_code,dept_id,warehouse_id
 */
@Data
public class WmsOutboundImportReqDTO {

    private Long id;

    @NotNull(message = "WMS出库单类型不能为空", groups = { ValidationGroup.create.class })
    @InEnum(WmsOutboundType.class)
    private Integer type;

    @InEnum(WmsOutboundStatus.class)
    private Integer outboundStatus;

    private Long companyId;

    private Long deptId;

    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime outboundTime;

    private Long latestOutboundActionId;

    private String remark;

    private String code;

    @NotNull(message = "来源单据ID不能为空")
    private Long upstreamBillId;

    private String upstreamBillCode;

    private Integer upstreamBillType;
}
