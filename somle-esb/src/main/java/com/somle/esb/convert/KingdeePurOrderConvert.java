package com.somle.esb.convert;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderItemDTO;
import com.somle.kingdee.model.KingdeePurOrderSaveReqVO;
import com.somle.kingdee.model.KingdeePurOrderSaveReqVO.MaterialEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 采购订单转换器
 * 用于将 SRM 系统的采购订单数据转换为金蝶系统所需的格式
 *
 * @author somle
 */
@Mapper
public interface KingdeePurOrderConvert {

    /**
     * 转换器实例
     */
    KingdeePurOrderConvert INSTANCE = Mappers.getMapper(KingdeePurOrderConvert.class);

    /**
     * 将 SRM 采购订单转换为金蝶采购订单
     * 转换包括：
     * 1. 基本信息：订单日期、订单编号、供应商信息等
     * 2. 商品分录：物料信息、数量、价格、金额等
     *
     * @param order SRM采购订单，包含订单基本信息和商品明细
     * @return 金蝶采购订单，如果输入为null则返回null
     */
    default KingdeePurOrderSaveReqVO convert(SrmPurchaseOrderDTO order) {
        if (order == null) {
            return null;
        }
        KingdeePurOrderSaveReqVO vo = new KingdeePurOrderSaveReqVO();

        // 1. 转换基本信息
        convertBasicInfo(vo, order);

        // 2. 转换商品分录
        if (order.getItems() != null) {
            vo.setMaterialEntity(convertToMaterialEntity(order.getItems()));
        }

        return vo;
    }

    /**
     * 转换订单基本信息
     * 包括：单据日期、单据编号、供应商信息、备注、总金额、外部单号等
     *
     * @param target 目标对象（金蝶采购订单）
     * @param source 源对象（SRM采购订单）
     */
    default void convertBasicInfo(KingdeePurOrderSaveReqVO target, SrmPurchaseOrderDTO source) {
        // 单据日期：格式化为 yyyy-MM-dd
        if (source.getOrderDate() != null) {
            target.setBillDate(DateUtil.format(source.getOrderDate(), "yyyy-MM-dd"));
        }

        // 单据编号
        target.setBillNo(StrUtil.trimToNull(source.getOrderNo()));

        // 供应商信息：ID转为字符串，编码去除空格
        if (source.getSupplierId() != null) {
            target.setSupplierId(String.valueOf(source.getSupplierId()));
        }
        target.setSupplierNumber(StrUtil.trimToNull(source.getSupplierCode()));

        // 备注
        target.setRemark(StrUtil.trimToNull(source.getRemark()));

        // 总金额：BigDecimal转Double
        if (source.getTotalAmount() != null) {
            target.setTotalAmount(source.getTotalAmount().doubleValue());
        }

        // 外部单号：ID转为字符串
        if (source.getId() != null) {
            target.setOutsidePkId(String.valueOf(source.getId()));
        }
    }

    /**
     * 将 SRM 采购订单列表转换为金蝶采购订单列表
     * 过滤掉null值，确保返回的列表不包含null元素
     *
     * @param orders SRM采购订单列表
     * @return 金蝶采购订单列表，如果输入为null则返回空列表
     */
    default List<KingdeePurOrderSaveReqVO> convertList(List<SrmPurchaseOrderDTO> orders) {
        if (orders == null) {
            return Collections.emptyList();
        }
        return orders.stream()
                .filter(Objects::nonNull)
                .map(this::convert)
                .filter(Objects::nonNull)
                .toList();
    }

    /**
     * 将 SRM 采购订单项列表转换为金蝶商品分录列表
     * 过滤掉null值，确保返回的列表不包含null元素
     *
     * @param items SRM采购订单项列表
     * @return 金蝶商品分录列表，如果输入为null则返回空列表
     */
    default List<MaterialEntity> convertToMaterialEntity(List<SrmPurchaseOrderItemDTO> items) {
        if (items == null) {
            return Collections.emptyList();
        }
        return items.stream()
                .filter(Objects::nonNull)
                .map(this::convertToMaterialEntity)
                .filter(Objects::nonNull)
                .toList();
    }

    /**
     * 将 SRM 采购订单项转换为金蝶商品分录
     * 转换包括：
     * 1. 物料信息：物料ID、物料编码
     * 2. 数量信息：数量、单价、金额
     * 3. 单位信息：单位ID、单位编码
     * 4. 其他信息：备注、交货日期、仓库、税率等
     *
     * @param item SRM采购订单项
     * @return 金蝶商品分录，如果输入为null则返回null
     */
    default MaterialEntity convertToMaterialEntity(SrmPurchaseOrderItemDTO item) {
        if (item == null) {
            return null;
        }
        MaterialEntity entity = new MaterialEntity();

        // 1. 物料信息
        entity.setMaterialId(String.valueOf(item.getMaterialId()));
        entity.setMaterialNumber(StrUtil.trimToNull(item.getMaterialCode()));

        // 2. 数量信息
        if (item.getQuantity() != null) {
            entity.setQty(item.getQuantity().doubleValue());
        }
        if (item.getPrice() != null) {
            entity.setPrice(item.getPrice().toString());
        }
        if (item.getAmount() != null) {
            entity.setAmount(item.getAmount().toString());
        }

        // 3. 单位信息
        entity.setUnitId(StrUtil.trimToNull(item.getUnit())); // 单位ID
        entity.setUnitNumber(StrUtil.trimToNull(item.getUnit())); // 单位编码

        // 4. 其他信息
        entity.setComment(StrUtil.trimToNull(item.getRemark()));
        entity.setDeliveryDate(item.getDeliveryDate());
        if (item.getWarehouseId() != null) {
            entity.setStockId(String.valueOf(item.getWarehouseId()));
        }
        entity.setStockNumber(StrUtil.trimToNull(item.getWarehouseName()));

        // 5. 税率相关信息
        if (item.getTaxPercent() != null) {
            entity.setCess(String.valueOf(item.getTaxPercent()));
        }
        if (item.getTaxAmount() != null) {
            entity.setTaxAmount(String.valueOf(item.getTaxAmount()));
        }
        if (item.getActTaxPrice() != null) {
            entity.setActTaxPrice(String.valueOf(item.getActTaxPrice()));
        }
        if (item.getAllAmount() != null) {
            entity.setAllAmount(String.valueOf(item.getAllAmount()));
        }

        // 6. 条码信息
        entity.setBarcode(StrUtil.trimToNull(item.getBarCode()));

        return entity;
    }
} 