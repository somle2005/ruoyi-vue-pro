package cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - ERP 渠道 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpChannelRespVO {

    @Schema(description = "渠道编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "3908")
    @ExcelProperty("渠道编号")
    private Long id;

    @Schema(description = "渠道编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("渠道编码")
    private String code;

    @Schema(description = "渠道名称", example = "王五")
    @ExcelProperty("渠道名称")
    private String name;

    @Schema(description = "渠道状态（1启用，0禁用）", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("渠道状态（1启用，0禁用）")
    private Boolean status;

    @Schema(description = "父渠道编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "31780")
    @ExcelProperty("父渠道编号")
    private Long parentId;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}