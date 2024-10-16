package cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - ERP 海关规则分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ErpCustomRulePageReqVO extends PageParam {

    @Schema(description = "国家编码")
    private String countryCode;

    @Schema(description = "类型", example = "报关")
    private String type;

    @Schema(description = "供应商产品编号")
    private Long supplierProductId;

    @Schema(description = "申报品名（英文）")
    private String declaredTypeEn;

    @Schema(description = "申报品名")
    private String declaredType;

    @Schema(description = "申报金额")
    private Double declaredValue;

    @Schema(description = "申报金额币种")
    private String declaredValueCurrencyCode;

    @Schema(description = "税率")
    private Integer taxRate;

    @Schema(description = "hs编码")
    private String hscode;

    @Schema(description = "物流属性")
    private String logisticAttribute;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}