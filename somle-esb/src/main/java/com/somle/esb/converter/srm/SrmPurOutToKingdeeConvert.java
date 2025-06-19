package com.somle.esb.converter.srm;

import cn.hutool.core.date.DateUtil;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseReturnDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseReturnItemDTO;
import com.somle.kingdee.model.KingdeePurReturnSaveReqVO;
import com.somle.kingdee.model.KingdeePurReturnSaveReqVO.MaterialEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.somle.esb.util.EsbTimeUtils.convertToUtc8;

/**
 * 采购退货单转换器
 */
public class SrmPurOutToKingdeeConvert {

    /**
     * 将采购退货单列表转换为金蝶采购退货单列表
     *
     * @param returnOrders 采购退货单列表
     * @return 金蝶采购退货单列表
     */
    public List<KingdeePurReturnSaveReqVO> convertReturnDTOList(List<SrmPurchaseReturnDTO> returnOrders) {
        if (returnOrders == null) {
            return new ArrayList<>();
        }
        return returnOrders.stream()
            .map(this::convert)
            .collect(Collectors.toList());
    }

    /**
     * 将采购退货单转换为金蝶采购退货单
     *
     * @param returnOrder 采购退货单
     * @return 金蝶采购退货单
     */
    public KingdeePurReturnSaveReqVO convert(SrmPurchaseReturnDTO returnOrder) {
        if (returnOrder == null) {
            return null;
        }

        KingdeePurReturnSaveReqVO kingdeeOrder = new KingdeePurReturnSaveReqVO();

        // 1. 设置基本信息
        kingdeeOrder.setBillNo(returnOrder.getCode());
        kingdeeOrder.setSupplierId(returnOrder.getSupplierId() == null ? null : String.valueOf(returnOrder.getSupplierId()));
        kingdeeOrder.setRemark(returnOrder.getRemark());
        //币别
//        kingdeeOrder.setCurrencyId(returnOrder.getCurrencyId() == null ? null : String.valueOf(returnOrder.getCurrencyId()));

        // 2. 设置日期
        if (returnOrder.getReturnTime() != null) {
            LocalDateTime utc8Time = convertToUtc8(returnOrder.getReturnTime());
            kingdeeOrder.setBillDate(DateUtil.format(utc8Time, "yyyy-MM-dd"));
        }

        // 3. 设置金额
        if (returnOrder.getTotalPrice() != null) {
            kingdeeOrder.setTotalAmount(returnOrder.getTotalPrice());
        }

        // 4. 转换商品分录
        if (returnOrder.getItems() != null) {
            List<MaterialEntity> materialEntities = returnOrder.getItems().stream()
                .map(this::convertToMaterialEntity)
                .collect(Collectors.toList());
            kingdeeOrder.setMaterialEntity(materialEntities);
        }

        return kingdeeOrder;
    }

    /**
     * 转换商品分录
     */
    public MaterialEntity convertToMaterialEntity(SrmPurchaseReturnItemDTO item) {
        if (item == null) {
            return null;
        }
        MaterialEntity entity = new MaterialEntity();

        // 1. 产品SKU信息
        entity.setMaterialId(item.getProductId() == null ? null : String.valueOf(item.getProductId()));
        entity.setMaterialNumber(item.getProductCode());

        // 2. 数量信息
        entity.setQty(item.getQty());
        if (item.getProductPrice() != null) {
            entity.setPrice(item.getProductPrice());
        }
        if (item.getTotalPrice() != null) {
            entity.setAmount(item.getTotalPrice());
        }

        // 3. 单位信息
        entity.setUnitId(item.getProductUnitId() == null ? null : String.valueOf(item.getProductUnitId()));

        // 4. 仓库信息
        if (item.getWarehouseId() != null) {
            entity.setStockId(String.valueOf(item.getWarehouseId()));
        }

        // 5. 税率相关信息
        if (item.getTaxRate() != null) {
            entity.setCess(item.getTaxRate());
        }
        if (item.getTax() != null) {
            entity.setTaxAmount(item.getTax());
        }
        if (item.getGrossPrice() != null) {
            entity.setTaxPrice(item.getGrossPrice());
        }

        // 6. 其他信息
        entity.setComment(item.getRemark());

        return entity;
    }
}
