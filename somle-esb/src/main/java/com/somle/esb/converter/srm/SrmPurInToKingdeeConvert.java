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
        kingdeeOrder.setBillNo(inOrder.getCode());
        kingdeeOrder.setSupplierNumber(String.valueOf(inOrder.getSupplierId()));
        kingdeeOrder.setRemark(inOrder.getRemark());

        // 2. 设置日期 - 使用单据日期
        if (inOrder.getBillTime() != null) {
            LocalDateTime utc8Time = EsbTimeUtils.convertToUtc8(inOrder.getBillTime());
            kingdeeOrder.setBillDate(DateUtil.format(utc8Time, "yyyy-MM-dd"));
        }

        // 3. 设置金额 - 使用最终合计价格
        if (inOrder.getTotalPrice() != null) {
            kingdeeOrder.setTotalAmount(inOrder.getTotalPrice());
        }

        // 4. 设置币别信息
        if (inOrder.getCurrencyId() != null) {
            kingdeeOrder.setCurrencyId(String.valueOf(inOrder.getCurrencyId()));
        }

        // 5. 设置汇率
        if (inOrder.getExchangeRate() != null) {
            kingdeeOrder.setExchangeRate(inOrder.getExchangeRate());
        }

        // 6. 转换商品分录
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

        // 1. 设置商品信息 - 使用产品编码
        entity.setMaterialNumber(item.getProductCode());

        // 2. 设置数量信息 - 使用实际入库数量
        entity.setQty(item.getActualQty());
        if (item.getProductPrice() != null) {
            entity.setPrice(item.getProductPrice());
        }
        if (item.getTotalPrice() != null) {
            entity.setAmount(item.getTotalPrice());
        }

        // 3. 设置仓库信息
        entity.setStockId(String.valueOf(item.getWarehouseId()));

        // 4. 设置单位信息(固定的单位"套")
//        entity.setUnitId(String.valueOf(item.getProductUnitId()));

        // 5. 设置税率相关信息
        if (item.getTaxRate() != null) {
            entity.setCess(item.getTaxRate());
        }
        if (item.getTax() != null) {
            entity.setTaxAmount(item.getTax());
        }
        if (item.getGrossPrice() != null) {
            entity.setTaxPrice(item.getGrossPrice());
        }
        if (item.getGrossTotalPrice() != null) {
            entity.setAllAmount(item.getGrossTotalPrice());
        }

        // 6. 设置备注
        entity.setComment(item.getRemark());

        // 7. 设置源单信息（如果有采购订单关联）
        if (item.getOrderCode() != null) {
            entity.setSrcOrderBillNo(item.getOrderCode());
        }
//        if (item.getOrderItemId() != null) {
//            entity.setSrcEntryId(String.valueOf(item.getOrderItemId()));
//        }

        // 8. 设置辅助属性（使用Item-ID作为辅助属性）
        entity.setAuxPropId(String.valueOf(item.getId()));

        return entity;
    }
}
