package cn.iocoder.yudao.module.erp.controller.admin.product.vo.category;

import com.fhs.core.trans.vo.VO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

/**
 * @author Administrator
 */
@Schema(description = "管理后台 - 产品分类自定义字段中间 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpProductCategoryFieldRespVO implements VO {

    @Schema(description = "ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "9570")
    @ExcelProperty("ID")
    private Long id;

    @Schema(description = "分类id", requiredMode = Schema.RequiredMode.REQUIRED, example = "27828")
    @ExcelProperty("分类id")
    private Long categoryId;

    @Schema(description = "字段id", requiredMode = Schema.RequiredMode.REQUIRED, example = "20464")
    @ExcelProperty("字段id")
    private Long fieldId;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}