package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.returns;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - ERP 采购退货分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SrmPurchaseReturnPageReqVO extends PageParam {

    @Schema(description = "到货单")
    private String code;

    @Schema(description = "供应商编号")
    private Long supplierId;

    @Schema(description = "退货时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] returnTime;

    @Schema(description = "备注")
    private String remark;

    @Schema(description = "退货状态")
    private Integer status;

    @Schema(description = "创建者")
    private String creator;

    @Schema(description = "产品编号")
    private Long productId;

    @Schema(description = "仓库编号")
    private Long warehouseId;

    @Schema(description = "结算账号编号")
    private Long accountId;

    @Schema(description = "采购单号")
    private String orderNo;

    @Schema(description = "退款状态")
    private Integer refundStatus;

    @Schema(description = "是否可退款")
    private Boolean refundEnable; // 对应 refundStatus = [0, 1]

}