package cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.tvstand;

import lombok.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @author Administrator
 */
@Schema(description = "管理后台 - ERP 电视机架产品分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ErpProductTvStandPageReqVO extends PageParam {

    @Schema(description = "产品主表id", example = "12330")
    private Long productId;

    @Schema(description = "层板承重")
    private String shelfLoadCapacity;

    @Schema(description = "层板数量", example = "22979")
    private Integer shelvesCount;

    @Schema(description = "电视调节方式")
    private String tvAdjustmentMethod;

    @Schema(description = "层板调节方式")
    private String shelfAdjustmentMethod;

    @Schema(description = "设计说明", example = "随便")
    private String description;

    @Schema(description = "宽度最大值")
    private BigDecimal widthMax;

    @Schema(description = "宽度最小值")
    private BigDecimal widthMin;

    @Schema(description = "长度最大值")
    private BigDecimal lengthMax;

    @Schema(description = "长度最小值")
    private BigDecimal lengthMin;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}