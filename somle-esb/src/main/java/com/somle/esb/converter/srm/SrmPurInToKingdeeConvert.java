package com.somle.esb.converter.srm;

import cn.hutool.core.date.DateUtil;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseInDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseInItemDTO;
import com.somle.esb.util.EsbTimeUtils;
import com.somle.kingdee.model.KingdeePurInboundSaveReqVO;
import com.somle.kingdee.model.KingdeePurInboundSaveReqVO.MaterialEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SrmPurInToKingdeeConvert {

    /**
     * 将 SRM 采购到货单列表转换为金蝶采购入库单列表
     *
     * @param inOrders SRM采购到货单列表
     * @return 金蝶采购入库单列表
     */
    public static List<KingdeePurInboundSaveReqVO> convertInDTOList(List<SrmPurchaseInDTO> inOrders) {
        if (inOrders == null) {
            return new ArrayList<>();
        }
        return inOrders.stream()
            .map(new SrmPurInToKingdeeConvert()::convert)
            .collect(Collectors.toList());
    }

    /**
     * 将 SRM 采购到货单转换为金蝶采购入库单
     *
     * @param inOrder SRM采购到货单
     * @return 金蝶采购入库单
     */
    public KingdeePurInboundSaveReqVO convert(SrmPurchaseInDTO inOrder) {
        if (inOrder == null) {
            return null;
        }

        KingdeePurInboundSaveReqVO kingdeeOrder = new KingdeePurInboundSaveReqVO();

        // 1. 设置基本信息
        kingdeeOrder.setBillNo(inOrder.getInNo());
        kingdeeOrder.setSupplierId(String.valueOf(inOrder.getSupplierId()));
        kingdeeOrder.setSupplierNumber(inOrder.getSupplierCode());
        kingdeeOrder.setRemark(inOrder.getRemark());

        // 2. 设置日期
        if (inOrder.getInDate() != null) {
            LocalDateTime utc8Time = EsbTimeUtils.convertToUtc8(inOrder.getInDate());
            kingdeeOrder.setBillDate(DateUtil.format(utc8Time, "yyyy-MM-dd"));
        }

        // 3. 设置金额
        if (inOrder.getTotalAmount() != null) {
            kingdeeOrder.setTotalAmount(inOrder.getTotalAmount());
        }

        // 4. 转换商品分录
        if (inOrder.getItems() != null) {
            List<MaterialEntity> materialEntities = inOrder.getItems().stream()
                .map(this::convertToMaterialEntity)
                .collect(Collectors.toList());
            kingdeeOrder.setMaterialEntity(materialEntities);
        }

        return kingdeeOrder;
    }

    /**
     * 转换商品分录
     */
    private MaterialEntity convertToMaterialEntity(SrmPurchaseInItemDTO item) {
        if (item == null) {
            return null;
        }

        MaterialEntity entity = new MaterialEntity();

        // 1. 设置商品信息
        entity.setMaterialId(String.valueOf(item.getMaterialId()));
        entity.setMaterialNumber(item.getMaterialCode());

        // 2. 设置数量信息
        entity.setQty(item.getActualQuantity());
        if (item.getPrice() != null) {
            entity.setPrice(item.getPrice());
        }
        if (item.getAmount() != null) {
            entity.setAmount(item.getAmount());
        }

        // 3. 设置仓库信息
        entity.setStockId(String.valueOf(item.getWarehouseId()));
        entity.setStockNumber(item.getWarehouseName());

        // 4. 设置单位信息
        entity.setUnitId(String.valueOf(item.getProductUnitId()));

        // 5. 设置税率相关信息
        if (item.getTaxRate() != null) {
            entity.setCess(item.getTaxRate());
        }
        if (item.getTaxAmount() != null) {
            entity.setTaxAmount(item.getTaxAmount());
        }
        if (item.getGrossPrice() != null) {
            entity.setTaxPrice(item.getGrossPrice());
        }
        if (item.getGrossTotalPrice() != null) {
            entity.setAllAmount(item.getGrossTotalPrice());
        }

        // 6. 设置备注
        entity.setComment(item.getRemark());

        return entity;
    }
}
