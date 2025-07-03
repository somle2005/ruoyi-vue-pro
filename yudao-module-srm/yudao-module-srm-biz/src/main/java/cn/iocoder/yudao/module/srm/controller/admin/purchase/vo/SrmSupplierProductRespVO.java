package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - ERP 供应商产品 Response VO")
@Data
@ExcelIgnoreUnannotated
public class SrmSupplierProductRespVO {

    @Schema(description = "供应商产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "768")
    @ExcelProperty("供应商产品编号")
    private Long id;

    @Schema(description = "供应商产品编码")
    @ExcelProperty("供应商产品编码")
    private String code;

    @Schema(description = "供应商编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "29689")
    @ExcelIgnore
    private Long supplierId;

    @Schema(description = "供应商名称", example = "芋道")
    @ExcelProperty("供应商名称")
    private String supplierName;

    @Schema(description = "产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "26097")
    @ExcelIgnore
    private Long productId;

    @Schema(description = "产品名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "巧克力")
    @ExcelProperty("产品名称")
    private String productName;

    @Schema(description = "包装高度")
    @ExcelProperty("包装高度")
    private Double packageHeight;

    @Schema(description = "包装长度")
    @ExcelProperty("包装长度")
    private Double packageLength;

    @Schema(description = "包装重量")
    @ExcelProperty("包装重量")
    private Double packageWeight;

    @Schema(description = "包装宽度")
    @ExcelProperty("包装宽度")
    private Double packageWidth;

    @Schema(description = "采购价格")
    @ExcelProperty("采购价格")
    private Double purchasePrice;

    @Schema(description = "采购货币代码")
    @ExcelProperty("采购货币代码")
    private Integer purchasePriceCurrencyCode;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "上次采购价格")
    @ExcelProperty("上次采购价格")
    private BigDecimal lastPurchasePrice;

    @Schema(description = "税率")
    @ExcelProperty("税率")
    private BigDecimal taxRate;

    @Schema(description = "是否默认供应商")
    @ExcelProperty("是否默认供应商")
    private Boolean defaultSupplier;

    @Schema(description = "版本号", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer version;
}