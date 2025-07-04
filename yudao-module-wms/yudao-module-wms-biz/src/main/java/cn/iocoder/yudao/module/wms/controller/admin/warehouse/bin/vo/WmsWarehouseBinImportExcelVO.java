package cn.iocoder.yudao.module.wms.controller.admin.warehouse.bin.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author jisencai
 */
@Schema(description = "仓库信息 - 库位管理 Import VO")
@Data
@ExcelIgnoreUnannotated
@Accessors(chain = false)
public class WmsWarehouseBinImportExcelVO {

    @ExcelProperty("名称")
    private String name;

    @ExcelProperty("归属的仓库ID")
    private Long warehouseId;

    @ExcelProperty("库区ID")
    private Long zoneId;

    @ExcelProperty("拣货顺序")
    private Integer pickingOrder;

    @ExcelProperty("货架")
    private String shelf;

    @ExcelProperty("巷道")
    private String aisle;

    @ExcelProperty("层数")
    private Integer layer;

    @ExcelProperty("类型 1标准 2超长")
    private Integer type;

    @ExcelProperty("长度(mm)")
    private Integer length;

    @ExcelProperty("宽度(mm)")
    private Integer width;

    @ExcelProperty("高度(mm)")
    private Integer height;
}
