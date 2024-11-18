package cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.xxxx;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - ERP xxxx产品 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpProductXxxxRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "7892")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "产品主表id", requiredMode = Schema.RequiredMode.REQUIRED, example = "12275")
    @ExcelProperty("产品主表id")
    private Long productId;

    @Schema(description = "大小")
    @ExcelProperty("大小")
    private Double size;

    @Schema(description = "地址")
    @ExcelProperty("地址")
    private String address;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}