package cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.tvstand;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - ERP 电视机架产品 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpProductTvStandRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "20264")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "产品主表id", requiredMode = Schema.RequiredMode.REQUIRED, example = "12330")
    @ExcelProperty("产品主表id")
    private Long productId;

    @Schema(description = "层板承重")
    @ExcelProperty("层板承重")
    private String shelfLoadCapacity;

    @Schema(description = "层板数量", example = "22979")
    @ExcelProperty("层板数量")
    private Integer shelvesCount;

    @Schema(description = "电视调节方式")
    @ExcelProperty("电视调节方式")
    private String tvAdjustmentMethod;

    @Schema(description = "层板调节方式")
    @ExcelProperty("层板调节方式")
    private String shelfAdjustmentMethod;

    @Schema(description = "设计说明", example = "随便")
    @ExcelProperty("设计说明")
    private String description;

    @Schema(description = "宽度最大值")
    @ExcelProperty("宽度最大值")
    private BigDecimal widthMax;

    @Schema(description = "宽度最小值")
    @ExcelProperty("宽度最小值")
    private BigDecimal widthMin;

    @Schema(description = "长度最大值")
    @ExcelProperty("长度最大值")
    private BigDecimal lengthMax;

    @Schema(description = "长度最小值")
    @ExcelProperty("长度最小值")
    private BigDecimal lengthMin;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}