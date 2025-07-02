package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TmsFirstMileRequestItemSummaryVO {
    /**
     * 数量汇总
     */
    @Schema(description = "数量汇总")
    private Integer sumQty;
    /**
     * 已订购数汇总
     */
    @Schema(description = "已订购数汇总")
    private Integer sumOrderClosedQty;
    /**
     * 包装长汇总
     */
    @Schema(description = "包装长汇总")
    private BigDecimal sumPackageLength;
    /** 包装宽汇总 */
    @Schema(description = "包装宽汇总")
    private BigDecimal sumPackageWidth;
    /** 包装高汇总 */
    @Schema(description = "包装高汇总")
    private BigDecimal sumPackageHeight;
    /**
     * 包装毛重汇总
     */
    @Schema(description = "包装毛重汇总")
    private BigDecimal sumPackageWeight;
    /** 基础重量汇总 */
    @Schema(description = "基础重量汇总")
    private BigDecimal sumWeight;

    @Schema(description = "总体积")
    private BigDecimal sumVolume;
} 