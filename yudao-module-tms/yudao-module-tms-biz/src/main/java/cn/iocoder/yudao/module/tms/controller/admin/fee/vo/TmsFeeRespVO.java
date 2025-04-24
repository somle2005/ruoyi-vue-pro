package cn.iocoder.yudao.module.tms.controller.admin.fee.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 出运订单费用明细 Response VO")
@Data
@ExcelIgnoreUnannotated
public class TmsFeeRespVO {

    @Schema(description = "主键ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "4931")
    @ExcelProperty("主键ID")
    private Long id;

    @Schema(description = "原单类型;出运订单、调拨单", example = "2")
    @ExcelProperty("原单类型;出运订单、调拨单")
    private String sourceType;

    @Schema(description = "原单ID;出运订单ID、调拨单ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "27529")
    @ExcelProperty("原单ID;出运订单ID、调拨单ID")
    private Long sourceId;

    @Schema(description = "费用类型（如运输费、关税）;字典", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("费用类型（如运输费、关税）;字典")
    private Integer costType;

    @Schema(description = "金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("金额")
    private BigDecimal amount;

    @Schema(description = "币种;名称（如 USD、CNY） 字典", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("币种;名称（如 USD、CNY） 字典")
    private Integer currencyType;

    @Schema(description = "备注", example = "你猜")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "乐观锁版本号")
    @ExcelProperty("乐观锁版本号")
    private Integer revision;

    @Schema(description = "创建时间")
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}