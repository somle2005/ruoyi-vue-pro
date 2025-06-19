package com.somle.esb.converter.srm;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderItemDTO;
import com.somle.kingdee.model.KingdeePurOrderSaveReqVO;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.somle.esb.util.EsbTimeUtils.convertToUtc8;
import static com.somle.esb.util.EsbTimeUtils.getUtc8Now;

public class SrmPurOrderToKingdeeConvert {

    /**
     * 将 SRM 采购订单列表转换为金蝶采购订单列表
     * 过滤掉null值，确保返回的列表不包含null元素
     *
     * @param orders SRM采购订单列表
     * @return 金蝶采购订单列表，如果输入为null则返回空列表
     */
    public List<KingdeePurOrderSaveReqVO> convertOrderDTOList(List<SrmPurchaseOrderDTO> orders) {
        if (orders == null) {
            return Collections.emptyList();
        }
        return orders.stream()
            .filter(Objects::nonNull)
            .map(this::convertOrderDTO)
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
    }

    /**
     * 将 SRM 采购订单转换为金蝶采购订单
     * 转换包括：
     * 1. 基本信息：订单日期、订单编号、供应商信息等
     * 2. 商品分录：物料信息、数量、价格、金额等
     *
     * @param order SRM采购订单，包含订单基本信息和商品明细
     * @return 金蝶采购订单，如果输入为null则返回null
     */
    public KingdeePurOrderSaveReqVO convertOrderDTO(SrmPurchaseOrderDTO order) {
        if (order == null) {
            return null;
        }
        KingdeePurOrderSaveReqVO vo = new KingdeePurOrderSaveReqVO();

        // 1. 转换基本信息
        convertBasicInfo(vo, order);

        // 2. 转换商品分录
        vo.setMaterialEntity(convertToMaterialEntity(order.getItems()));

        return vo;
    }

    /**
     * 转换订单基本信息
     * 包括：单据日期、单据编号、供应商信息、备注、总金额、外部单号等
     *
     * @param target 目标对象（金蝶采购订单）
     * @param dto    源对象（SRM采购订单）
     */
    public void convertBasicInfo(KingdeePurOrderSaveReqVO target, SrmPurchaseOrderDTO dto) {
        // 单据日期：格式化为 yyyy-MM-dd
        if (dto.getBillTime() != null) {
            // 将0区时间转换为东八区时间
            LocalDateTime utc8Time = convertToUtc8(dto.getBillTime());
            target.setBillDate(DateUtil.format(utc8Time, "yyyy-MM-dd"));
        } else {
            // 将当前UTC时间转换为东八区时间
            target.setBillDate(DateUtil.format(getUtc8Now(), "yyyy-MM-dd"));
        }

        // 单据编号
        target.setBillNo(StrUtil.trimToNull(dto.getCode()));

        //TODO  供应商信息：ID转为字符串，编码去除空格  client拿ID
//        if (dto.getSupplierId() != null) {
//            target.setSupplierId(String.valueOf(dto.getSupplierId()));
//        }
        target.setSupplierNumber(dto.getSupplierName());

        // 备注
        target.setRemark(StrUtil.trimToNull(dto.getRemark()));

        // 总金额：BigDecimal转Double
        if (dto.getTotalPrice() != null) {
            target.setTotalAmount(dto.getTotalPrice().doubleValue());
        }

        // 外部单号：ID转为字符串
        target.setOutsidePkId(String.valueOf(dto.getId()));
    }

    /**
     * 将 SRM 采购订单项列表转换为金蝶商品分录列表
     * 过滤掉null值，确保返回的列表不包含null元素
     *
     * @param items SRM采购订单项列表
     * @return 金蝶商品分录列表，如果输入为null则返回空列表
     */
    List<KingdeePurOrderSaveReqVO.MaterialEntity> convertToMaterialEntity(List<SrmPurchaseOrderItemDTO> items) {
        if (items == null) {
            return Collections.emptyList();
        }
        return items.stream()
            .filter(Objects::nonNull)
            .map(this::convertToMaterialEntity)
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
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
    KingdeePurOrderSaveReqVO.MaterialEntity convertToMaterialEntity(SrmPurchaseOrderItemDTO item) {
        if (item == null) {
            return null;
        }
        KingdeePurOrderSaveReqVO.MaterialEntity entity = new KingdeePurOrderSaveReqVO.MaterialEntity();

        //注册证号 <-> itemID
        entity.setProRegNo(String.valueOf(item.getId()));
        // 1. 产品SKU信息
        entity.setMaterialNumber(StrUtil.trimToNull(item.getProductCode()));

        // 2. 数量信息
        entity.setQty(item.getQty().doubleValue());
        if (item.getProductPrice() != null) {
            entity.setPrice(item.getProductPrice().toString());
        }
        if (item.getTotalPrice() != null) {
            entity.setAmount(item.getTotalPrice().toString());
        }

        // 3. 单位信息
        entity.setUnitNumber(StrUtil.trimToNull(item.getProductUnitName()));

        // 4. 其他信息
        entity.setComment(StrUtil.trimToNull(item.getRemark()));
        if (item.getDeliveryTime() != null) {
            // 将0区时间转换为东八区时间
            LocalDateTime utc8Time = convertToUtc8(item.getDeliveryTime());
            entity.setDeliveryDate(DateUtil.format(utc8Time, "yyyy-MM-dd"));
        } else {
            // 将当前UTC时间转换为东八区时间
            entity.setDeliveryDate(DateUtil.format(getUtc8Now(), "yyyy-MM-dd"));
        }


        // 5. 税率相关信息
        if (item.getTaxRate() != null) {
            entity.setCess(String.valueOf(item.getTaxRate()));
        }
        if (item.getTax() != null) {
            entity.setTaxAmount(String.valueOf(item.getTax()));
        }
        if (item.getGrossPrice() != null) {
            entity.setActTaxPrice(String.valueOf(item.getGrossPrice()));
        }
        if (item.getGrossTotalPrice() != null) {
            entity.setAllAmount(String.valueOf(item.getGrossTotalPrice()));
        }

        return entity;
    }
}
