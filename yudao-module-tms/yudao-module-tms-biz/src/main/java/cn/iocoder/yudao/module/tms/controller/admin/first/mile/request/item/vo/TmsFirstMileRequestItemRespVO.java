package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestRespVO;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 头程申请表明细 Response VO")
@Data
@ExcelIgnoreUnannotated
public class TmsFirstMileRequestItemRespVO {


    private TmsFirstMileRequestRespVO firstMileRequest;

    @Schema(description = "明细编号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("明细编号")
    private Long id;

    @Schema(description = "创建时间")
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;


    @Schema(description = "FBA条码")
    @ExcelProperty("FBA条码")
    private String fbaBarCode;

    @Schema(description = "申请数量", requiredMode = Schema.RequiredMode.REQUIRED)
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

    @Schema(description = "产品id")
    @ExcelProperty("产品id")
    private Long productId;

    @Schema(description = "产品信息")
    private ErpProductDTO product;
}