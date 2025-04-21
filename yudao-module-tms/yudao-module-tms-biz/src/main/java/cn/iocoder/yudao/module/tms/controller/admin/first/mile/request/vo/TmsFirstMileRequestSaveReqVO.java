package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo;

import cn.iocoder.yudao.module.system.api.utils.Validation;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemSaveReqVO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Data;

import java.util.List;

@Schema(description = "管理后台 - 头程申请单新增/修改 Request VO")
@Data
public class TmsFirstMileRequestSaveReqVO {

    @Schema(description = "主键ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @Null(groups = Validation.OnCreate.class, message = "创建时，id必须为空")
    @NotNull(groups = Validation.OnUpdate.class, message = "更新时，id不能为空")
    private Long id;

    @Schema(description = "单据编号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "单据编号不能为空")
    private String code;

    @Schema(description = "申请人ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "申请人ID不能为空")
    private Long requestUserId;

    @Schema(description = "申请部门ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "申请部门ID不能为空")
    private Long requestDeptId;

    @Schema(description = "目的仓ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "目的仓ID不能为空")
    private Long toWarehouseId;

//    @Schema(description = "总重量（kg）")
//    private BigDecimal totalWeight;
//
//    @Schema(description = "总体积（m³）")
//    private BigDecimal totalVolume;

    @Schema(description = "版本号")
    @NotNull(groups = Validation.OnUpdate.class, message = "版本号更新时不能为空")
    @Null(groups = Validation.OnCreate.class, message = "版本号新增需为空")
    private Integer revision;

    @Schema(description = "头程申请表明细列表")
    private List<TmsFirstMileRequestItemSaveReqVO> firstMileRequestItems;

}