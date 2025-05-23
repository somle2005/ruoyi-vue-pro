package cn.iocoder.yudao.module.wms.api.inbound.dto;

import lombok.Data;

/**
 * @table-fields : tenant_id,creator,create_time,outbound_pending_qty,available_qty,purchase_transit_qty,updater,update_time,product_id,shelving_pending_qty,id,defective_qty,return_transit_qty,sellable_qty,purchase_plan_qty,warehouse_id
 */
@Data
public class WmsStockWarehouseSimpleDTO {

    private Long id;

    private Long warehouseId;

    private Long productId;

    private Integer availableQty;

    private Integer defectiveQty;

    private Integer outboundPendingQty;

    private Integer purchasePlanQty;

    private Integer purchaseTransitQty;

    private Integer returnTransitQty;

    private Integer sellableQty;

    private Integer shelvingPendingQty;

    private Integer totalQty;


}
