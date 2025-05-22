package cn.iocoder.yudao.module.wms.api.outbound.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @table-fields : tenant_id,creator,company_id,create_time,bin_id,plan_qty,upstream_item_id,remark,outbound_id,updater,update_time,outbound_status,actual_qty,product_id,id,dept_id
 */
@Data
public class WmsOutboundItemRespDTO {

    private Long id;

    private Long outboundId;

    private Long productId;

    private LocalDateTime createTime;

    private String creatorName;

    private String updaterName;

//    private WmsProductRespSimpleVO product;
//
//    private WmsInboundRespVO outbound;

    private Integer outboundStatus;

    private String creator;

    private String updater;

    private LocalDateTime updateTime;

    private Long tenantId;

    private Long binId;

    private Integer actualQty;

    private Integer planQty;

    private Long companyId;

    private Long deptId;

//    private WmsWarehouseBinRespVO bin;

    private String remark;

    private Long upstreamItemId;

//    private DeptSimpleRespVO dept;
//
//    private FmsCompanySimpleRespVO company;
}
