package cn.iocoder.yudao.module.wms.controller.admin.pickup.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @author jisencai
 * @table-fields : tenant_id,creator,update_time,code,create_time,upstream_id,id,upstream_code,warehouse_id,upstream_type,updater
 */
@Schema(description = "管理后台 - 拣货单 Response VO")
@Data
@ExcelIgnoreUnannotated
public class WmsPickupExcelDownloadVO {

//    @Schema(description = "入库单ID")
//    @ExcelProperty("入库单ID")
//    private Long inboundId;

    @Schema(description = "单据号")
    @ExcelProperty("单据号")
    private String code;

    @Schema(description = "仓库ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "22380")
    private Long warehouseId;

    @Schema(description = "仓库")
    @ExcelProperty("仓库")
    private String warehouseName;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ExcelProperty("更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "更新人", example = "李四")
    @ExcelProperty("更新人姓名")
    private String updaterName;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "创建人", example = "张三")
    @ExcelProperty("创建人")
    private String creatorName;

}
