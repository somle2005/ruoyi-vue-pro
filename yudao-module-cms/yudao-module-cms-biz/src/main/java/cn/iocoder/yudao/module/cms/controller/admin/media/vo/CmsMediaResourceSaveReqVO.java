package cn.iocoder.yudao.module.cms.controller.admin.media.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Schema(description = "管理后台 - 文件新增/修改 Request VO")
@Data
public class CmsMediaResourceSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "3364")
    private Long id;

    @Schema(description = "应用编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "应用编码不能为空")
    private String appCode;

    @Schema(description = "模块编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "模块编码不能为空")
    private String moduleCode;

    @Schema(description = "资源标题", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "资源标题不能为空")
    private String title;

    @Schema(description = "资源描述", example = "随便")
    private String description;

    @Schema(description = "存储路径", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "存储路径不能为空")
    private List<String> storagePath;

    @Schema(description = "资源类型1图片2视频3音频4文档", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "资源类型1图片2视频3音频4文档不能为空")
    private Integer mediaType;

}