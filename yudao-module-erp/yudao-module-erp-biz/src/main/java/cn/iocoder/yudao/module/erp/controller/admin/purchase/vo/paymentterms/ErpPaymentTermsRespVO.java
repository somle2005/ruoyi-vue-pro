package cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

/**
 * @author Administrator
 */
@Schema(description = "管理后台 - 付款条款管理 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpPaymentTermsRespVO {

    @Schema(description = "付款条款id", requiredMode = Schema.RequiredMode.REQUIRED, example = "31923")
    @ExcelProperty("付款条款id")
    private Long id;

    @Schema(description = "付款条款编码")
    @ExcelProperty("付款条款编码")
    private String code;

    @Schema(description = "描述", example = "你说的对")
    @ExcelProperty("描述")
    private String description;

    @Schema(description = "1代表国内，0代表国外（默认国内）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("1代表国内，0代表国外（默认国内）")
    private Boolean isDomestic;

    @Schema(description = "描述（英文）")
    @ExcelProperty("描述（英文）")
    private String descriptionEn;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}