package cn.iocoder.yudao.module.wms.api.inbound.item.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * WMS - 入库单批次库存 DTO
 * 字段来源：
 * - WmsInboundItemDO: 基础入库单详情字段
 * - WmsInboundItemBinQueryDO: 入库单批次库存查询特有字段
 *
 * @author wdy
 */
@Data
public class WmsInboundItemBinDTO {

    // ========== WmsInboundItemDO 字段 ==========

    /**
     * 产品编号
     * 来源：WmsInboundItemDO
     */
    private Long productId;

    /**
     * 产品名称
     * 来源：关联查询
     */
    private String productName;

    /**
     * 产品SKU
     * 来源：关联查询
     */
    private String productSku;

    /**
     * 仓库编号
     * 来源：WmsInboundItemBinQueryDO
     */
    private Long warehouseId;

    /**
     * 仓库名称
     * 来源：关联查询
     */
    private String warehouseName;

    /**
     * 公司编号
     * 来源：WmsInboundItemDO
     */
    private Long companyId;

    /**
     * 公司名称
     * 来源：关联查询
     */
    private String companyName;

    /**
     * 公司简称
     * 来源：关联查询
     */
    private String companyAbbr;

    /**
     * 入库部门编号
     * 来源：WmsInboundItemDO
     */
    private Long inboundDeptId;

    /**
     * 入库公司编号
     * 来源：WmsInboundItemDO
     */
    private Long inboundCompanyId;

    /**
     * 入库状态 ; InboundStatus : 0-未入库 , 1-部分入库 , 2-已入库
     * 来源：WmsInboundItemDO
     */
    private Integer inboundStatus;

    /**
     * 实际入库量
     * 来源：WmsInboundItemDO
     */
    private Integer actualQty;

    /**
     * 计划入库量
     * 来源：WmsInboundItemDO
     */
    private Integer planQty;

    /**
     * 已上架量，已经拣货到仓位的库存量
     * 来源：WmsInboundItemDO
     */
    private Integer shelvedQty;

    /**
     * 可用数量
     * 来源：WmsInboundItemBinQueryDO
     */
    private Integer availableQuantity;

    /**
     * 批次号
     * 来源：关联查询
     */
    private String batchNo;

    /**
     * 入库时间
     * 来源：关联查询
     */
    private LocalDateTime inboundTime;

    /**
     * 备注
     * 来源：WmsInboundItemDO
     */
    private String remark;

    /**
     * 库位编号
     * 来源：WmsInboundItemBinQueryDO
     */
    private Long binId;

    /**
     * 库位编码
     * 来源：关联查询
     */
    private String binCode;

    /**
     * 仓位可用库存
     * 来源：WmsInboundItemBinQueryDO
     */
    private Integer binAvailableQty;

    /**
     * 仓位可售库存
     * 来源：WmsInboundItemBinQueryDO
     */
    private Integer binSellableQty;

    /**
     * 仓位待出库库存
     * 来源：WmsInboundItemBinQueryDO
     */
    private Integer binOutboundPendingQty;

    /**
     * 上架单ID
     * 来源：WmsInboundItemBinQueryDO
     */
    private String pickupId;

    /**
     * 上架数量
     * 来源：WmsInboundItemBinQueryDO
     */
    private Integer pickupQty;

    /**
     * 上架单号
     * 来源：WmsInboundItemBinQueryDO
     */
    private String pickupCode;

    /**
     * 入库单号
     * 来源：WmsInboundItemBinQueryDO
     */
    private String inboundCode;

    /**
     * 库龄
     * 来源：WmsInboundItemBinQueryDO
     */
    private Integer age;
} 