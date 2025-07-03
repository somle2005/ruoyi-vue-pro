package cn.iocoder.yudao.module.cms.controller.admin.media.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Schema(description = "管理后台 - 文件 Response VO")
@Data
@ExcelIgnoreUnannotated
public class CmsMediaResourceRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "3364")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "应用编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("应用编码")
    private Integer appCode;

    @Schema(description = "模块编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("模块编码")
    private Integer moduleCode;

    @Schema(description = "资源标题", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("资源标题")
    private String title;

    @Schema(description = "资源描述", example = "随便")
    @ExcelProperty("资源描述")
    private String description;

    @Schema(description = "存储路径", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("存储路径")
    private List<String> storagePath;

    @Schema(description = "资源类型1图片2视频3音频4文档", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("资源类型1图片2视频3音频4文档")
    private Integer mediaType;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}