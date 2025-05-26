package cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.req;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemPageReqVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 头程单分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TmsFirstMilePageReqVO extends PageParam {

    private mainQueryVO mainQueryVO;
    @Schema(description = "嵌套用 - 头程单明细分页查询条件")
    private TmsFirstMileItemPageReqVO itemPageReqVO;

    @Data
    @Schema(description = "主查询条件")
    public static class mainQueryVO {
        @Schema(description = "id")
        private Long id;

        @Schema(description = "销售公司ID")
        private Long salesCompanyId;

        @Schema(description = "创建时间")
        private LocalDateTime[] createTime;

        @Schema(description = "编码")
        private String code;

        @Schema(description = "单据日期")
        private LocalDateTime[] billTime;

        @Schema(description = "物流商ID")
        private String carrierId;

        @Schema(description = "结算日期")
        private LocalDateTime[] settlementDate;

        @Schema(description = "应付款余额")
        private BigDecimal balance;

        @Schema(description = "审核人")
        private Long auditorId;

        @Schema(description = "审核时间")
        private LocalDateTime[] auditTime;

        @Schema(description = "审核状态")
        private Integer auditStatus;

        @Schema(description = "目的仓ID")
        private Long toWarehouseId;

        @Schema(description = "提单号")
        private String ladingNo;

        @Schema(description = "柜型（字典）")
        private Integer cabinetType;

        @Schema(description = "装柜日期")
        private LocalDateTime[] packTime;

        @Schema(description = "预计到货日期")
        private LocalDateTime[] arrivePlanTime;

        @Schema(description = "预计送仓时间")
        private LocalDateTime[] deliveryEstimateTime;

        @Schema(description = "实际送仓时间")
        private LocalDateTime[] deliveryActualTime;

        @Schema(description = "货柜体积（m³）")
        private BigDecimal[] totalVolume;

        @Schema(description = "货柜毛重（kg）")
        private BigDecimal[] totalWeight;

        @Schema(description = "货柜净重（kg）")
        private BigDecimal[] netWeight;

        @Schema(description = "货柜货值（按最近采购价）")
        private BigDecimal[] totalValue;

        @Schema(description = "货柜件数")
        private Integer[] totalQty;

        @Schema(description = "备注")
        private String remark;

        @Schema(description = "发货状态")
        private Integer outboundStatus;

        @Schema(description = "出库时间")
        private LocalDateTime[] outboundTime;

        @Schema(description = "入库状态")
        private Integer inboundStatus;

        @Schema(description = "入库时间")
        private LocalDateTime[] inboundTime;
    }

    @Schema(description = "嵌套用 - 跟踪信息筛选 VO")
    private TmsVesselTrackingQueryVO trackingQueryVO;

    @Schema(description = "嵌套用 - 跟踪信息筛选 VO")
    @Data
    public static class TmsVesselTrackingQueryVO {

        @Schema(description = "预计到港时间（ETA）")
        @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
        private LocalDateTime[] arriveEstimateTime;

        @Schema(description = "预计离港时间（ETD）")
        @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
        private LocalDateTime[] departEstimateTime;

        @Schema(description = "实际到港时间（ATA）")
        @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
        private LocalDateTime[] arriveActualTime;

        @Schema(description = "实际离港时间（ATD）")
        @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
        private LocalDateTime[] departActualTime;

        @Schema(description = "提柜时间")
        @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
        private LocalDateTime[] pickupTime;

        @Schema(description = "还柜时间")
        @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
        private LocalDateTime[] returnTime;

        @Schema(description = "数据来源（API渠道标识）")
        private String apiSource;

        @Schema(description = "最近同步时间")
        @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
        private LocalDateTime[] lastSyncTime;

        @Schema(description = "中转港")
        private Long transitPort;

        @Schema(description = "目的港")
        private Long toPort;

        @Schema(description = "装运港")
        private Long fromPort;

        @Schema(description = "船公司（供应商id）")
        private Long carrierCompanyId;

        @Schema(description = "船名")
        private String vessel;

        @Schema(description = "航次")
        private String voyage;

        @Schema(description = "货代公司(供应商ID)")
        private Long forwarderCompanyId;

        @Schema(description = "箱号")
        private String containerNo;
    }

}
