package cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo;

import lombok.*;

import java.math.BigDecimal;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - ERP 店铺产品分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ErpShopProductPageReqVO extends PageParam {

    @Schema(description = "店铺产品名称", example = "赵六")
    private String name;

    @Schema(description = "店铺名称", example = "赵六")
    private String shopName;

    @Schema(description = "平台", example = "赵六")
    private String platform;

    @Schema(description = "店铺ID")
    private Long shopId;

    @Schema(description = "店铺产品编码")
    private String code;

    @Schema(description = "价格")
    private BigDecimal price;

    @Schema(description = "币种")
    private String currency;

    @Schema(description = "备注", example = "你猜")
    private String remark;

    @Schema(description = "开启状态", example = "1")
    private Integer status;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

    @Schema(description = "链接", example = "https://www.iocoder.cn")
    private String url;

}