package cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product;

import lombok.*;

import java.math.BigDecimal;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @author Administrator
 */
@Schema(description = "管理后台 - ERP 渠道平台产品分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ErpChannelProductPageReqVO extends PageParam {

    @Schema(description = "渠道产品编码")
    private String code;

    @Schema(description = "渠道产品名称", example = "李四")
    private String name;

    @Schema(description = "渠道产品状态（1启用，0禁用）", example = "2")
    private Boolean status;

    @Schema(description = "渠道名称", example = "14526")
    private Integer channelId;

    @Schema(description = "产品名称", example = "28174")
    private Integer productId;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

    @Schema(description = "链接地址", example = "https://www.iocoder.cn")
    private String url;

    @Schema(description = "底价", example = "3897")
    private BigDecimal bottomPrice;

    @Schema(description = "负责人id", example = "16580")
    private String ownerId;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}