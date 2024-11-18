package cn.iocoder.yudao.module.erp.controller.admin.product.vo.product;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

/**
 * @author Administrator
 */
@Schema(description = "管理后台 - ERP 产品 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpProductRespVO {

    @Schema(description = "产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "731")
    @ExcelProperty("产品编号")
    private Long id;

    @Schema(description = "产品名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "张三")
    @ExcelProperty("产品名称")
    private String name;

    @Schema(description = "产品分类编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "30796")
    @ExcelProperty("产品分类编号")
    private Long categoryId;
    @Schema(description = "产品分类", requiredMode = Schema.RequiredMode.REQUIRED, example = "水果")
    @ExcelProperty("产品分类")
    private String categoryName;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "部门id", requiredMode = Schema.RequiredMode.REQUIRED, example = "3419")
    @ExcelProperty("部门id")
    private Long deptId;

    @Schema(description = "SKU（编码）")
    @ExcelProperty("SKU（编码）")
    private String barCode;

    @Schema(description = "单位编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "9042")
    @ExcelProperty("单位编号")
    private Long unitId;
    @Schema(description = "单位", requiredMode = Schema.RequiredMode.REQUIRED, example = "个")
    @ExcelProperty("单位")
    private String unitName;


    @Schema(description = "材料（中文）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("材料（中文）")
    private String material;

    @Schema(description = "产品状态（1启用，0禁用）", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("产品状态（1启用，0禁用）")
    private Boolean status;

    @Schema(description = "基础重量（kg）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("基础重量（kg）")
    private BigDecimal weight;

    @Schema(description = "系列")
    @ExcelProperty("系列")
    private String series;

    @Schema(description = "型号")
    @ExcelProperty("型号")
    private String model;

    @Schema(description = "流水号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("流水号")
    private Integer serial;

    @Schema(description = "生产编号")
    @ExcelProperty("生产编号")
    private String productionNo;

    @Schema(description = "基础宽度（mm）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("基础宽度（mm）")
    private BigDecimal width;

    @Schema(description = "基础长度（mm）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("基础长度（mm）")
    private BigDecimal length;

    @Schema(description = "基础高度（mm）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("基础高度（mm）")
    private BigDecimal height;

    @Schema(description = "图片url", example = "https://www.iocoder.cn")
    @ExcelProperty("图片url")
    private String imageUrl;

    @Schema(description = "指导价，json格式", requiredMode = Schema.RequiredMode.REQUIRED, example = "4771")
    @ExcelProperty("指导价，json格式")
    private String guidePrice;

    @Schema(description = "专利")
    @ExcelProperty("专利")
    private String patent;

    @Schema(description = "PO产品经理id", example = "18303")
    @ExcelProperty("PO产品经理id")
    private Long poId;

    @Schema(description = "ID工业设计id", example = "14564")
    @ExcelProperty("ID工业设计id")
    private Long idId;

    @Schema(description = "RD研发工程师id", example = "13409")
    @ExcelProperty("RD研发工程师id")
    private Long rdId;

    @Schema(description = "维护工程师id", example = "11519")
    @ExcelProperty("维护工程师id")
    private Long meId;

    @Schema(description = "备注", example = "随便")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "辅助字段")
    private Object additional;

}