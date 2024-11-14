package cn.iocoder.yudao.module.erp.controller.admin.product.vo.product;

import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductUnitDO;
import cn.iocoder.yudao.module.system.api.value.dto.SystemValueDTO;
import com.fhs.core.trans.anno.Trans;
import com.fhs.core.trans.constant.TransType;
import com.fhs.core.trans.vo.VO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

/**
 * @author Administrator
 */
@Schema(description = "管理后台 - ERP 产品 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpProductRespVO implements VO {

    @Schema(description = "产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "19197")
    @ExcelProperty("产品编号")
    private Long id;

    @Schema(description = "产品名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "李四")
    @ExcelProperty("产品名称")
    private String name;

    @Schema(description = "图片URL", example = "https://www.iocoder.cn")
    @ExcelProperty("图片URL")
    private String imageUrl;

    @Schema(description = "部门id", example = "23043")
    @Trans(type = TransType.SIMPLE, targetClassName = "cn.iocoder.yudao.module.system.dal.dataobject.dept.DeptDO", fields = "name", ref = "deptName")
    private Long deptId;

    @Schema(description = "部门名称", example = "李四")
    private String deptName;

    @Schema(description = "产品分类编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "11161")
    private Long categoryId;

    @Schema(description = "产品分类名称")
    private String categoryName;

    @Schema(description = "单位编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1509")
    @ExcelProperty("单位编号")
    @Trans(type = TransType.SIMPLE, target = ErpProductUnitDO.class,fields = "name",ref = "unitName")
    private Long unitId;

    @Schema(description = "单位名称")
    @ExcelProperty("单位名称")
    private String unitName;

    @Schema(description = "产品备注", example = "你说的对")
    @ExcelProperty("产品备注")
    private String remark;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "产品编码(SKU)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("产品编码(SKU)")
    private String barCode;

    @Schema(description = "材料（中文）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("材料（中文）")
    private String material;

    @Schema(description = "产品状态（1启用，0禁用）", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
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

    @Schema(description = "流水号")
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

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}