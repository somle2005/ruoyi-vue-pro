package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo;

import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemRespVO;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Schema(description = "管理后台 - 头程申请单 Response VO")
@Data
@ExcelIgnoreUnannotated
public class TmsFirstMileRequestRespVO {

    @Schema(description = "主键ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("主键ID")
    private Long id;

    @Schema(description = "创建时间")
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "单据编号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("单据编号")
    private String code;

    @Schema(description = "申请人ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("申请人ID")
    private Long requestUserId;

    @Schema(description = "申请部门ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("申请部门ID")
    private Long requestDeptId;

    @Schema(description = "目的仓ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("目的仓ID")
    private Long toWarehouseId;

    @Schema(description = "审核状态")
    @ExcelProperty("审核状态")
    private Integer auditStatus;

    @Schema(description = "订购状态")
    @ExcelProperty("订购状态")
    private Integer orderStatus;

    @Schema(description = "关闭状态")
    @ExcelProperty("关闭状态")
    private Integer offStatus;

    @Schema(description = "总重量（kg）")
    @ExcelProperty("总重量（kg）")
    private BigDecimal totalWeight;

    @Schema(description = "总体积（m³）")
    @ExcelProperty("总体积（m³）")
    private BigDecimal totalVolume;

    @Schema(description = "头程申请表明细列表")
    @ExcelProperty("明细数量")
    private Integer itemCount;

    @Schema(description = "头程申请表明细列表")
    private List<TmsFirstMileRequestItemRespVO> items;
}