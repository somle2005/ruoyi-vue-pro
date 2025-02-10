package cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo;

import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemRespVO;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Schema(description = "管理后台 - 海关品类 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpCustomRuleCategoryRespVO {

    @Schema(description = "编号")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "创建时间")
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "材质-字典")
    @ExcelProperty("材质-字典")
    private Integer material;

    @Schema(description = "报关品名")
    @ExcelProperty("报关品名")
    private String declaredType;

    @Schema(description = "英文品名")
    @ExcelProperty("英文品名")
    private String declaredTypeEn;

    @Schema(description = "材质对应string+报关品名")
    @ExcelProperty("材质对应string+报关品名")
    private String combinedValue;

    @Schema(description = "海关品类子表列表")
    private List<ErpCustomRuleCategoryItemRespVO> customRuleCategoryItems;

}