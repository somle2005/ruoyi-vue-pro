package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.order.req;

import com.mzt.logapi.starter.annotation.DiffLogField;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;

@Schema(description = "管理后台 - ERP 采购订单 合并 VO")
@Data
public class SrmPurchaseOrderMergeReqVO {

    @Schema(description = "入库清单列表")
    @NotNull(message = "入库项不能为空")
    @Size(min = 1, message = "入库项至少一个")
    @DiffLogField(name = "入库清单列表")
    Collection<@Valid item> items;
    @Schema(description = "单据日期")
    @DiffLogField(name = "单据日期")
    private LocalDateTime billTime;
    @Schema(description = "供应商编号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "供应商编号不能为空")
    @DiffLogField(name = "供应商编号")
    private Long supplierId;
    //收获地址
    @Schema(description = "收获地址")
    @DiffLogField(name = "收货地址")
    private String address;
    @Schema(description = "结算日期")
    @DiffLogField(name = "结算日期")
    private LocalDateTime settlementDate;
    @Schema(description = "结算账户编号")
    @DiffLogField(name = "结算账户编号")
    private Long accountId;
    @Schema(description = "优惠率，百分比", requiredMode = Schema.RequiredMode.REQUIRED)
    @DiffLogField(name = "优惠率")
    private BigDecimal discountPercent;
    @Schema(description = "其它金额，单位：元")
    @DiffLogField(name = "其它金额")
    private BigDecimal otherPrice;
    @Schema(description = "附件地址")
    @DiffLogField(name = "附件地址")
    private String fileUrl;
    @Schema(description = "入库主单备注")
    @DiffLogField(name = "入库主单备注")
    private String remark;

    @Data
    public static class item {

        @Schema(description = "采购订单项编号")
        @NotNull(message = "采购订单项编号不能为空")
        @DiffLogField(name = "采购订单项编号")
        private Long itemId;

        @Schema(description = "到货数量", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull(message = "到货数量不能为空")
        @DiffLogField(name = "到货数量")
        private BigDecimal qty;
    }
}
