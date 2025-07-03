package cn.iocoder.yudao.module.tms.service.bo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TmsFirstMileRequestItemSummaryBO {
    // 数量汇总
    private Integer sumQty;
    // 已订购数汇总
    private Integer sumOrderClosedQty;
    // 包装长汇总
    private BigDecimal sumPackageLength;
    // 包装宽汇总
    private BigDecimal sumPackageWidth;
    // 包装高汇总
    private BigDecimal sumPackageHeight;
    // 包装毛重汇总
    private BigDecimal sumPackageWeight;
    // 基础重量汇总
    private BigDecimal sumWeight;
    //动态计算总体积
    private BigDecimal sumVolume;
} 