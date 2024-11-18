package cn.iocoder.yudao.module.erp.controller.admin.product.vo.product;

import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.json.GuidePriceJson;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.json.ImageUrlJson;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

@Schema(description = "管理后台 - ERP 产品新增/修改 Request VO")
@Data
public class ErpProductSaveReqVO {

    @Schema(description = "产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "731")
    private Long id;

    @Schema(description = "产品名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "张三")
    @NotEmpty(message = "产品名称不能为空")
    private String name;

    @Schema(description = "产品分类编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "30796")
    @NotNull(message = "产品分类编号不能为空")
    private Long categoryId;

    @Schema(description = "部门id", requiredMode = Schema.RequiredMode.REQUIRED, example = "3419")
    @NotNull(message = "部门id不能为空")
    private Long deptId;

    @Schema(description = "SKU（编码）")
    private String barCode;

    @Schema(description = "单位编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "9042")
    @NotNull(message = "单位编号不能为空")
    private Long unitId;

    @Schema(description = "材料（中文）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "材料（中文）不能为空")
    private String material;

    @Schema(description = "产品状态（1启用，0禁用）", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "产品状态（1启用，0禁用）不能为空")
    private Boolean status;

    @Schema(description = "基础重量（kg）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "基础重量（kg）不能为空")
    private BigDecimal weight;

    @Schema(description = "系列")
    private String series;

    @Schema(description = "型号")
    private String model;

    @Schema(description = "流水号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "流水号不能为空")
    private Integer serial;

    @Schema(description = "生产编号")
    private String productionNo;

    @Schema(description = "基础宽度（mm）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "基础宽度（mm）不能为空")
    private BigDecimal width;

    @Schema(description = "基础长度（mm）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "基础长度（mm）不能为空")
    private BigDecimal length;

    @Schema(description = "基础高度（mm）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "基础高度（mm）不能为空")
    private BigDecimal height;

    @Schema(description = "图片URL，json格式", requiredMode = Schema.RequiredMode.REQUIRED, example = "https://www.iocoder.cn")
    //@NotEmpty(message = "图片不能为空")
    private List<@Valid ImageUrlJson> imageUrl;

    @Schema(description = "指导价，json格式", requiredMode = Schema.RequiredMode.REQUIRED, example = "16486")
    //@NotEmpty(message = "指导价不能为空")
    private List<@Valid GuidePriceJson> guidePrice;

    @Schema(description = "专利")
    private String patent;

    @Schema(description = "PO产品经理id", example = "18303")
    private Long poId;

    @Schema(description = "ID工业设计id", example = "14564")
    private Long idId;

    @Schema(description = "RD研发工程师id", example = "13409")
    private Long rdId;

    @Schema(description = "维护工程师id", example = "11519")
    private Long meId;

    @Schema(description = "备注", example = "随便")
    private String remark;

    @Schema(description = "颜色", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "颜色不能为空")
    private String color;

    @Schema(description = "额外字段")
    private Map<String,Object> additionalMap;

}