package cn.iocoder.yudao.module.system.controller.admin.user.vo.user;

import lombok.*;

import java.util.*;

import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 用户配置分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SystemUserConfigPageReqVO extends PageParam {

    @Schema(description = "用户id", example = "12182", hidden = true)
    private Long userId;

    @Schema(description = "配置键")
    private String configKey;

    @Schema(description = "配置值")
    private String configValue;

    @Schema(description = "作用域（1前端 2后端）", hidden = true)
    private Integer scope;

    @Schema(description = "创建时间")
    private LocalDateTime[] createTime;

}