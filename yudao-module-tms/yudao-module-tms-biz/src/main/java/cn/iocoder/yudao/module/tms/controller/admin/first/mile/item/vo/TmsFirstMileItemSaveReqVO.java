package cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo;

import cn.iocoder.yudao.module.system.api.utils.Validation;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - 头程单明细新增/修改 Request VO")
@Data
public class TmsFirstMileItemSaveReqVO {
    //id
    @Schema(description = "id")
    @NotNull(groups = {Validation.OnUpdate.class}, message = "更新时，头程单明细id不能为空")
    @Null(groups = {Validation.OnCreate.class}, message = "创建时，头程单明细id需为空")
    private Long id;

    @Schema(description = "申请项ID")
    private Long requestItemId;

    @Schema(description = "产品ID")
    private Long productId;

    @Schema(description = "FBA条码")
    private String fbaProductCode;

    @Schema(description = "件数")
    private Integer qty;

    @Schema(description = "箱数")
    private Integer boxQty;

    @Schema(description = "库存公司")
    private Long companyId;

    @Schema(description = "库存归属部门ID")
    private Long deptId;

    @Schema(description = "备注")
    private String remark;

    @Schema(description = "计划发货数")
    private Integer outboundPlanQty;

    @Schema(description = "发出仓ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "发出仓ID不能为空")
    private Long fromWarehouseId;

    @Schema(description = "包装长（cm）")
    private BigDecimal packageLength;

    @Schema(description = "包装宽（cm）")
    private BigDecimal packageWidth;

    @Schema(description = "包装高（cm）")
    private BigDecimal packageHeight;

    @Schema(description = "毛重（kg）")
    private BigDecimal packageWeight;

    @Schema(description = "体积（m³）")
    private BigDecimal volume;

    @Schema(description = "销售公司ID")
    @NotNull(message = "销售公司不能为空")
    private Long salesCompanyId;

    @Schema(description = "版本号")
    @NotNull(groups = {Validation.OnUpdate.class}, message = "更新时版本号不能为空")
    private Integer revision;
}