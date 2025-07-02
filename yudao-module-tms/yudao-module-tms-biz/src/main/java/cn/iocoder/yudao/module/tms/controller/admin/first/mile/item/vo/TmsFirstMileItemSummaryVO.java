package cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TmsFirstMileItemSummaryVO {
    /**
     * 数量汇总
     */
    @Schema(description = "数量汇总")
    private Integer sumQty;
    /**
     * 箱数汇总
     */
    @Schema(description = "箱数汇总")
    private Integer sumBoxQty;
    /**
     * 包装长汇总
     */
    @Schema(description = "包装长汇总")
    private BigDecimal sumPackageLength;
    /**
     * 包装宽汇总
     */
    @Schema(description = "包装宽汇总")
    private BigDecimal sumPackageWidth;
    /**
     * 包装高汇总
     */
    @Schema(description = "包装高汇总")
    private BigDecimal sumPackageHeight;
    /**
     * 包装毛重汇总
     */
    @Schema(description = "包装毛重汇总")
    private BigDecimal sumPackageWeight;
    /**
     * 基础重量汇总
     */
    @Schema(description = "基础重量汇总")
    private BigDecimal sumWeight;
    /**
     * 实际发货数(回填)汇总
     */
    @Schema(description = "实际发货数(回填)汇总")
    private Integer sumOutboundClosedQty;
    /**
     * 计划发货数汇总
     */
    @Schema(description = "计划发货数汇总")
    private Integer sumOutboundPlanQty;
    /**
     * 已入库数量(回填)汇总
     */
    @Schema(description = "已入库数量(回填)汇总")
    private Integer sumInboundClosedQty;
} 