package cn.iocoder.yudao.module.system.controller.admin.data.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 字段属性分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SystemDataTypePageReqVO extends PageParam {

    @Schema(description = "属性名称")
    private String attribute;

    @Schema(description = "属性名对应键")
    private String key;

    @Schema(description = "显示顺序")
    private Integer sort;

    @Schema(description = "是否必须")
    private Boolean require;

    @Schema(description = "数据类型", example = "1")
    private Integer type;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}