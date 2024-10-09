package cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - ERP采购申请单 Response VO")
@Data
@ExcelIgnoreUnannotated
public class PurchaseRequestRespVO {

    @Schema(description = "id", requiredMode = Schema.RequiredMode.REQUIRED, example = "32561")
    @ExcelProperty("id")
    private Long id;

    @Schema(description = "单据编号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("单据编号")
    private String serial;

    @Schema(description = "当日申请排序编号", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("当日申请排序编号")
    private Integer num;

    @Schema(description = "申请人", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("申请人")
    private String applicant;

    @Schema(description = "申请部门")
    @ExcelProperty("申请部门")
    private String applicationDept;

    @Schema(description = "单据日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("单据日期")
    private LocalDateTime date;

    @Schema(description = "审核状态(0:待审核，1:审核通过，2:审核未通过)", example = "2")
    @ExcelProperty("审核状态(0:待审核，1:审核通过，2:审核未通过)")
    private Integer applicationStatus;

    @Schema(description = "关闭状态（0已关闭，1已开启）", example = "1")
    @ExcelProperty("关闭状态（0已关闭，1已开启）")
    private Integer offStatus;

    @Schema(description = "订购状态（0部分订购，1全部订购）", example = "1")
    @ExcelProperty("订购状态（0部分订购，1全部订购）")
    private Integer orderStatus;

    @Schema(description = "审核者")
    @ExcelProperty("审核者")
    private String auditor;

    @Schema(description = "审核时间")
    @ExcelProperty("审核时间")
    private LocalDateTime auditTime;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}