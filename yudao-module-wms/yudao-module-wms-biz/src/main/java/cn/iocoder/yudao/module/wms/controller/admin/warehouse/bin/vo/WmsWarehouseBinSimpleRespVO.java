package cn.iocoder.yudao.module.wms.controller.admin.warehouse.bin.vo;

import cn.iocoder.yudao.module.wms.controller.admin.warehouse.zone.vo.WmsWarehouseZoneSimpleRespVO;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author jisencai
 * @table-fields : tenant_id,zone_id,creator,update_time,code,create_time,picking_order,name,id,status,updater,warehouse_id
 */
@Schema(description = "管理后台 - 库位 Response VO")
@Data
@ExcelIgnoreUnannotated
public class WmsWarehouseBinSimpleRespVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "23735")
    @ExcelProperty("主键")
    private Long id;

    @Schema(description = "代码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("代码")
    private String code;

    @Schema(description = "名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "王五")
    @ExcelProperty("名称")
    private String name;

    @Schema(description = "归属的仓库ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "14159")
    @ExcelProperty("归属的仓库ID")
    private Long warehouseId;

    @Schema(description = "库区ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "29995")
    @ExcelProperty("库区ID")
    private Long zoneId;

    @Schema(description = "拣货顺序")
    @ExcelProperty("拣货顺序")
    private Integer pickingOrder;

    @Schema(description = "库区")
    @ExcelProperty("库区")
    private WmsWarehouseZoneSimpleRespVO zone;

    @Schema(description = "货架")
    @ExcelProperty("货架")
    private String shelf;

    @Schema(description = "巷道")
    @ExcelProperty("巷道")
    private String aisle;

    @Schema(description = "层数")
    @ExcelProperty("层数")
    private Integer layer;

    @Schema(description = "类型 1标准 2超长")
    @ExcelProperty("类型")
    private Integer type;

    @Schema(description = "长度mm")
    @ExcelProperty("长度mm")
    private Integer length;

    @Schema(description = "宽度mm")
    @ExcelProperty("宽度mm")
    private Integer width;

    @Schema(description = "高度mm")
    @ExcelProperty("高度mm")
    private Integer height;

}
