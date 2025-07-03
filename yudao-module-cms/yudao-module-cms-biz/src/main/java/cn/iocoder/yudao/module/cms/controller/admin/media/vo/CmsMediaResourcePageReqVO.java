package cn.iocoder.yudao.module.cms.controller.admin.media.vo;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 文件分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CmsMediaResourcePageReqVO extends PageParam {

    @Schema(description = "应用编码")
    private Integer appCode;

    @Schema(description = "模块编码")
    private Integer moduleCode;

    @Schema(description = "资源标题")
    private String title;

    @Schema(description = "资源描述", example = "随便")
    private String description;

    @Schema(description = "资源类型1图片2视频3音频4文档", example = "1")
    private Integer mediaType;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}