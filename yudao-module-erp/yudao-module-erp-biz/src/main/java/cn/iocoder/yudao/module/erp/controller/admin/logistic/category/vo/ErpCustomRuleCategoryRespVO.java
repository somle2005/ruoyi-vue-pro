package cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Schema(description = "管理后台 - 海关品类 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpCustomRuleCategoryRespVO {

    @Schema(description = "乐观锁")
    @ExcelProperty("乐观锁")
    private Integer revision;

    @Schema(description = "创建时间")
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "编号", example = "7348")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "材质-字典")
    @ExcelProperty("材质-字典")
    private Integer material;

    @Schema(description = "报关品名", example = "2")
    @ExcelProperty("报关品名")
    private String declaredType;

    @Schema(description = "英文品名")
    @ExcelProperty("英文品名")
    private String declaredTypeEn;

    @Schema(description = "材质对应string+报关品名")
    @ExcelProperty("材质对应string+报关品名")
    private String combinedValue;

}