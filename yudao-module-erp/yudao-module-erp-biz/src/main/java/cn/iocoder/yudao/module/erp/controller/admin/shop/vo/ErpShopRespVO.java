package cn.iocoder.yudao.module.erp.controller.admin.shop.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - ERP 店铺 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpShopRespVO {

    @Schema(description = "店铺编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "27401")
    @ExcelProperty("店铺编号")
    private Long id;

    @Schema(description = "店铺名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "王五")
    @ExcelProperty("店铺名称")
    private String name;

    @Schema(description = "店铺编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("店铺编码")
    private String code;

    @Schema(description = "备注", example = "你猜")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "开启状态", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("开启状态")
    private Integer status;

    @Schema(description = "排序")
    @ExcelProperty("排序")
    private Integer sort;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "类型 0线上 1线上", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("类型 0线上 1线上")
    private Integer type;

    @Schema(description = "平台")
    @ExcelProperty("平台")
    private String platform;

    @Schema(description = "账号", example = "647")
    @ExcelProperty("账号")
    private String account;

}