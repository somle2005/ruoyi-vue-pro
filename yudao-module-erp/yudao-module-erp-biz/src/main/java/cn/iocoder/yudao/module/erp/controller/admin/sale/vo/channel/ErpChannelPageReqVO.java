package cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - ERP 渠道分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ErpChannelPageReqVO extends PageParam {

    @Schema(description = "渠道编码")
    private String code;

    @Schema(description = "渠道名称", example = "王五")
    private String name;

    @Schema(description = "渠道状态（1启用，0禁用）", example = "2")
    private Boolean status;

    @Schema(description = "父渠道编号", example = "31780")
    private Long parentId;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}