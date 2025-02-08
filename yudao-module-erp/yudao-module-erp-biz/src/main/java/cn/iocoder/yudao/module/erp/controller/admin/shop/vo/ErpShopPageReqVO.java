package cn.iocoder.yudao.module.erp.controller.admin.shop.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - ERP 店铺分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ErpShopPageReqVO extends PageParam {

    @Schema(description = "店铺名称", example = "王五")
    private String name;

    @Schema(description = "店铺编码")
    private String code;

    @Schema(description = "开启状态", example = "1")
    private Integer status;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

    @Schema(description = "类型 0线上 1线上", example = "1")
    private Integer type;

    @Schema(description = "平台")
    private String platform;

    @Schema(description = "账号", example = "647")
    private String account;

}