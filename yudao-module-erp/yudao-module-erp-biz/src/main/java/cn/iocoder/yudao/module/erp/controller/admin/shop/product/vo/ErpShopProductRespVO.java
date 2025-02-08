package cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - ERP 店铺产品 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpShopProductRespVO {

    @Schema(description = "店铺产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "18131")
    @ExcelProperty("店铺产品编号")
    private Long id;

    @Schema(description = "店铺产品名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "赵六")
    @ExcelProperty("店铺产品名称")
    private String name;

    @Schema(description = "店铺产品编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("店铺产品编码")
    private String code;

    @Schema(description = "备注", example = "你猜")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "开启状态", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("开启状态")
    private Integer status;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "链接", example = "https://www.iocoder.cn")
    @ExcelProperty("链接")
    private String url;

}