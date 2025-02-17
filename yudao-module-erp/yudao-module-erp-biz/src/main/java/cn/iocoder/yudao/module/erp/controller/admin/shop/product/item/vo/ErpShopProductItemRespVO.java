package cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo;

import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespSimpleVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - ERP 店铺产品项 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpShopProductItemRespVO {

    @Schema(description = "店铺产品项编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "15443")
    @ExcelProperty("店铺产品项编号")
    private Long id;

    @Schema(description = "产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "27593")
    @ExcelProperty("产品编号")
    private Long productId;

    @Schema(description = "产品数量", example = "27593")
    @ExcelProperty("产品数量")
    private Long quantity;

    @Schema(description = "关联产品", requiredMode = Schema.RequiredMode.REQUIRED, example = "27593")
    @ExcelProperty("关联产品")
    private ErpProductRespSimpleVO product;

    @Schema(description = "店铺产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "27593")
    @ExcelProperty("店铺产品编号")
    private Long shopProductId;

    @Schema(description = "备注", example = "你说的对")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}