package cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 付款条款管理分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ErpPaymentTermsPageReqVO extends PageParam {

    @Schema(description = "付款条款编码")
    private String code;

    @Schema(description = "描述", example = "你说的对")
    private String description;

    @Schema(description = "1代表国内，0代表国外（默认国内）")
    private Boolean isDomestic;

    @Schema(description = "描述（英文）")
    private String descriptionEn;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}