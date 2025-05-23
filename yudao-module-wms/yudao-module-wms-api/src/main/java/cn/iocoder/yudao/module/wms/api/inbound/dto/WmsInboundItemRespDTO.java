package cn.iocoder.yudao.module.wms.api.inbound.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @table-fields : tenant_id,outbound_available_qty,creator,inbound_status,company_id,create_time,plan_qty,shelved_qty,upstream_item_id,remark,inbound_dept_id,latest_flow_id,updater,inbound_id,inbound_company_id,update_time,actual_qty,product_id,id,dept_id
 */
@Data
public class WmsInboundItemRespDTO {

    private Long id;

    private Long warehouseId;

    private Long inboundId;

    private Long productId;

    private LocalDateTime createTime;

    private String creatorName;

    private String updaterName;

    private String creator;

    private Long tenantId;

    private LocalDateTime updateTime;

    private String updater;

//    private WmsProductRespSimpleVO product;

    private Integer inboundStatus;

//    private WmsInboundSimpleRespVO inbound;

    private Integer actualQty;

    private Integer age;

    private Integer outboundAvailableQty;

    private Integer planQty;

    private Integer shelvedQty;

    private Integer shelveAvailableQty;

    private Long latestFlowId;

//    private WmsWarehouseSimpleRespVO warehouse;

    private Long deptId;

//    private DeptSimpleRespVO dept;

    private Long companyId;

    private String remark;

//    private FmsCompanySimpleRespVO company;

    private Long upstreamItemId;

    private Long inboundCompanyId;

    private Long inboundDeptId;

//    private DeptSimpleRespVO inboundDept;

//    private FmsCompanySimpleRespVO inboundCompany;

    private WmsStockWarehouseSimpleDTO stockWarehouse;

//    private List<WmsWarehouseBinSimpleRespVO> warehouseBinList;

    private Integer stockType;

}
