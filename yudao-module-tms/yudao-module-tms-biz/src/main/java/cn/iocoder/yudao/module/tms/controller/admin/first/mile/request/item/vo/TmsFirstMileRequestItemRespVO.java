package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 头程申请表明细 Response VO")
@Data
@ExcelIgnoreUnannotated
@Accessors(chain = false)
public class TmsFirstMileRequestItemRespVO {

    @Schema(description = "明细编号")
    @ExcelProperty("明细编号")
    private Long id;

    @Schema(description = "创建时间")
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;


    @Schema(description = "产品id")
    private Long productId;

    @Schema(description = "FBA条码")
    @ExcelProperty("FBA条码")
    private String fbaBarCode;

    @Schema(description = "申请数量")
    @ExcelProperty("申请数量")
    private Integer qty;

    @Schema(description = "包装长（cm）")
    @ExcelProperty("包装长（cm）")
    private BigDecimal packageLength;

    @Schema(description = "包装宽（cm）")
    @ExcelProperty("包装宽（cm）")
    private BigDecimal packageWidth;

    @Schema(description = "包装高（cm）")
    @ExcelProperty("包装高（cm）")
    private BigDecimal packageHeight;

    @Schema(description = "毛重（kg）")
    @ExcelProperty("毛重（kg）")
    private BigDecimal packageWeight;

    @Schema(description = "体积（m³）")
    @ExcelProperty("体积（m³）")
    private BigDecimal volume;

    @Schema(description = "订购状态")
    @ExcelProperty("订购状态")
    private Integer orderStatus;

    @Schema(description = "关闭状态")
    @ExcelProperty("关闭状态")
    private Integer offStatus;

    @Schema(description = "已订购数")
    @ExcelProperty("已订购数")
    private Integer orderClosedQty;

    @ExcelProperty("产品SKU")
    private String barCode;
    //产品名称
    @ExcelProperty("产品名称")
    private String productName;

    @Schema(description = "版本号")
    private Integer revision;

//    @Schema(description = "产品信息")
//    @ExcelIgnore
//    private ErpProductDTO product;
}