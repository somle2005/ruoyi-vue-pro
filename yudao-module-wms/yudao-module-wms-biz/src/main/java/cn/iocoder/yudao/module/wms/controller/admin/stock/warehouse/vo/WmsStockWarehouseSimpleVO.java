package cn.iocoder.yudao.module.wms.controller.admin.stock.warehouse.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @table-fields : tenant_id,creator,create_time,outbound_pending_qty,available_qty,purchase_transit_qty,updater,update_time,product_id,shelving_pending_qty,id,defective_qty,return_transit_qty,sellable_qty,purchase_plan_qty,warehouse_id
 */
@Schema(description = "管理后台 - 仓库库存 Response VO")
@Data
@ExcelIgnoreUnannotated
public class WmsStockWarehouseSimpleVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "21341")
    @ExcelProperty("主键")
    private Long id;

    @Schema(description = "仓库ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "14491")
    @ExcelProperty("仓库ID")
    private Long warehouseId;

    @Schema(description = "产品ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "3153")
    @ExcelProperty("产品ID")
    private Long productId;


    @Schema(description = "可用量，在库的良品数量", example = "")
    @ExcelProperty("可用量，在库的良品数量")
    private Integer availableQty;

    @Schema(description = "不良品数量", example = "")
    @ExcelProperty("不良品数量")
    private Integer defectiveQty;

    @Schema(description = "待出库量", example = "")
    @ExcelProperty("待出库量")
    private Integer outboundPendingQty;

    @Schema(description = "采购计划量", example = "")
    @ExcelProperty("采购计划量")
    private Integer purchasePlanQty;

    @Schema(description = "采购在途量", example = "")
    @ExcelProperty("采购在途量")
    private Integer purchaseTransitQty;

    @Schema(description = "退件在途数量", example = "")
    @ExcelProperty("退件在途数量")
    private Integer returnTransitQty;

    @Schema(description = "可售量，未被单据占用的良品数量", example = "")
    @ExcelProperty("可售量，未被单据占用的良品数量")
    private Integer sellableQty;

    @Schema(description = "待上架数量，上架是指从拣货区上架到货架", example = "")
    @ExcelProperty("待上架数量，上架是指从拣货区上架到货架")
    private Integer shelvingPendingQty;



}
