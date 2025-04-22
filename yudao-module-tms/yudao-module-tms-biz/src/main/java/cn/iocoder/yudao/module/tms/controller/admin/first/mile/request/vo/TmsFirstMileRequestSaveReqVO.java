package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo;

import cn.iocoder.yudao.module.system.api.utils.Validation;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemSaveReqVO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

import static cn.iocoder.yudao.module.tms.dal.redis.no.TmsNoRedisDAO.FIRST_MILE_REQUEST_NO_PREFIX;

@Schema(description = "管理后台 - 头程申请单新增/修改 Request VO")
@Data
public class TmsFirstMileRequestSaveReqVO {

    @Schema(description = "主键ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @Null(groups = Validation.OnCreate.class, message = "创建时，id必须为空")
    @NotNull(groups = Validation.OnUpdate.class, message = "更新时，id不能为空")
    private Long id;

    @Schema(description = "单据编号", requiredMode = Schema.RequiredMode.REQUIRED)
    @Pattern(regexp = "^" + FIRST_MILE_REQUEST_NO_PREFIX + "-\\d{8}-\\d{6}$",
             message = "单据编号格式不正确，正确格式如：" + FIRST_MILE_REQUEST_NO_PREFIX + "-20250108-000001")
    @Pattern(regexp = "^" + FIRST_MILE_REQUEST_NO_PREFIX + "-\\d{8}-[0-8]\\d{5}$",
             message = "单据编号格式不正确，注意后6位序号中不能以9开头,正确格式:" + FIRST_MILE_REQUEST_NO_PREFIX + "-20250108-000001")
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

    @Schema(description = "审核状态")
    private Integer auditStatus;

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
    @Size(min = 1, message = "头程申请表明细列表至少有一个")
    private List<@Valid TmsFirstMileRequestItemSaveReqVO> items;

}