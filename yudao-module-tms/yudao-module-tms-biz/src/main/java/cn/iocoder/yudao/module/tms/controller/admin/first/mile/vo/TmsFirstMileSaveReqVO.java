package cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo;

import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeSaveReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemSaveReqVO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Schema(description = "管理后台 - 头程单新增/修改 Request VO")
@Data
public class TmsFirstMileSaveReqVO {
    //id
    @Schema(description = "id")
    @NotNull(message = "id不能为空")
    private Long id;

    @Schema(description = "编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "编码不能为空")
    private String code;

    @Schema(description = "单据日期")
    private LocalDateTime billTime;

    @Schema(description = "物流商ID")
    private String carrierId;

    @Schema(description = "结算日期")
    private LocalDateTime settlementDate;

    @Schema(description = "应付款余额")
    private BigDecimal balance;

    @Schema(description = "目的仓ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "目的仓ID不能为空")
    private Long toWarehouseId;

    @Schema(description = "提单号")
    private String ladingNo;

    @Schema(description = "柜型（字典）")
    private Integer cabinetType;

    @Schema(description = "装柜日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "装柜日期不能为空")
    private LocalDateTime packTime;

    @Schema(description = "预计到货日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "预计到货日期不能为空")
    private LocalDateTime arrivePlanTime;

    @Schema(description = "预计送仓时间")
    private LocalDateTime deliveryEstimateTime;

    @Schema(description = "实际送仓时间")
    private LocalDateTime deliveryActualTime;

    @Schema(description = "货柜体积（m³）")
    private BigDecimal totalVolume;

    @Schema(description = "货柜毛重（kg）")
    private BigDecimal totalWeight;

    @Schema(description = "货柜净重（kg）")
    private BigDecimal netWeight;

    @Schema(description = "货柜货值（按最近采购价）")
    private BigDecimal totalValue;

    @Schema(description = "货柜件数")
    private Integer totalQty;

    @Schema(description = "备注")
    private String remark;

    @Schema(description = "发货状态")
    private Integer outboundStatus;

    @Schema(description = "出库时间")
    private LocalDateTime outboundTime;

    @Schema(description = "入库状态")
    private Integer inboundStatus;

    @Schema(description = "入库时间")
    private LocalDateTime inboundTime;

    @Schema(description = "头程单明细列表")
    private List<TmsFirstMileItemSaveReqVO> firstMileItems;

    @Schema(description = "出运订单费用明细列表")
    private List<TmsFeeSaveReqVO> fees;

}