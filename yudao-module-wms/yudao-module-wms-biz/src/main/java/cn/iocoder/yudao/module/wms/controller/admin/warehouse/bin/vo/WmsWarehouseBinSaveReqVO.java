package cn.iocoder.yudao.module.wms.controller.admin.warehouse.bin.vo;

import cn.iocoder.yudao.framework.common.validation.InEnum;
import cn.iocoder.yudao.module.wms.enums.common.WmsValidStatus;
import com.mzt.logapi.starter.annotation.DiffLogAllFields;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author jisencai
 * @table-fields : zone_id,code,picking_order,name,id,status,warehouse_id
 */
@Schema(description = "管理后台 - 库位新增/修改 Request VO")
@Data
@DiffLogAllFields
public class WmsWarehouseBinSaveReqVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "23735")
    private Long id;

    @Schema(description = "代码", requiredMode = Schema.RequiredMode.REQUIRED)
    private String code;

    @Schema(description = "名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "王五")
    @NotEmpty(message = "名称不能为空")
    private String name;

    @Schema(description = "归属的仓库ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "14159")
    @NotNull(message = "归属的仓库ID不能为空")
    private Long warehouseId;

    @Schema(description = "库区ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "29995")
    @NotNull(message = "库区ID不能为空")
    private Long zoneId;

    @Schema(description = "拣货顺序")
    private Integer pickingOrder;

    @Schema(description = "状态，WMS通用的对象有效状态 ; ValidStatus : 0-不可用 , 1-可用", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "状态不能为空")
    @InEnum(WmsValidStatus.class)
    private Integer status;

    @Schema(description = "货架")
    private String shelf;

    @Schema(description = "巷道")
    private String aisle;

    @Schema(description = "层数")
    private Integer layer;

    @Schema(description = "类型 1标准 2超长")
    @NotNull(message = "类型不能为空")
    private Integer type;

    @Schema(description = "长度mm")
    private Integer length;

    @Schema(description = "宽度mm")
    private Integer width;

    @Schema(description = "高度mm")
    private Integer height;
}
