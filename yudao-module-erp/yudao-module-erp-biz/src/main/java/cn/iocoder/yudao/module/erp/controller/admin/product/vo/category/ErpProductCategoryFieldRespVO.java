package cn.iocoder.yudao.module.erp.controller.admin.product.vo.category;

import com.fhs.core.trans.anno.Trans;
import com.fhs.core.trans.constant.TransType;
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
    @Trans(type = TransType.SIMPLE, targetClassName = "cn.iocoder.yudao.module.system.dal.dataobject.field.SystemFieldDO",
    fields = {"attribute","key","require","type"},refs = {"attribute","key","require","type"})
    private Long fieldId;

    @Schema(description = "字段属性值")
    @ExcelProperty("字段属性值")
    private String attribute;

    @Schema(description = "属性名对应键")
    @ExcelProperty("属性名对应键")
    private String key;

    @Schema(description = "是否必须")
    @ExcelProperty("是否必须")
    private Boolean require;

    @Schema(description = "数据类型")
    @ExcelProperty("数据类型")
    private Integer type;

}