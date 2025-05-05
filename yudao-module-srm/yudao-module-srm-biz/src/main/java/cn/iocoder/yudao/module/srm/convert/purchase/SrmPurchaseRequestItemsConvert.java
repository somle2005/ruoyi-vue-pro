package cn.iocoder.yudao.module.srm.convert.purchase;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseRequestItemsDO;
import cn.iocoder.yudao.module.srm.service.purchase.bo.req.SrmPurchaseRequestBO;
import cn.iocoder.yudao.module.srm.service.purchase.bo.req.SrmPurchaseRequestItemsBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.BeanUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 采购申请项->采购订单的订单项
 */
@Mapper
public interface SrmPurchaseRequestItemsConvert {
    SrmPurchaseRequestItemsConvert INSTANCE = Mappers.getMapper(SrmPurchaseRequestItemsConvert.class);

    /**
     * 将ItemsBO列表转换为PurchaseRequestBO列表
     *
     * @param itemsBOList 采购申请项BO列表
     * @return 采购申请BO列表
     */
    default List<SrmPurchaseRequestBO> convertList(List<SrmPurchaseRequestItemsBO> itemsBOList) {
        if (CollUtil.isEmpty(itemsBOList)) {
            return Collections.emptyList();
        }
        // 按主表ID分组，收集子项
        Map<Long, List<SrmPurchaseRequestItemsDO>> itemsMap = itemsBOList.stream()
                .collect(Collectors.groupingBy(
                        SrmPurchaseRequestItemsDO::getRequestId,
                        Collectors.mapping(bo -> (SrmPurchaseRequestItemsDO) bo, Collectors.toList())
                ));

        // 转换为BO列表
        return itemsBOList.stream()
                .map(bo -> {
                    SrmPurchaseRequestBO requestBO = new SrmPurchaseRequestBO();
                    // 复制主表属性
                    BeanUtils.copyProperties(bo.getPurchaseRequest(), requestBO);
                    // 设置子项列表
                    requestBO.setItems(itemsMap.get(bo.getRequestId()));
                    return requestBO;
                })
                .collect(Collectors.toList());
    }

    /**
     * 将单个ItemsBO转换为PurchaseRequestBO
     *
     * @param itemsBO 采购申请项BO
     * @return 采购申请BO
     */
    default SrmPurchaseRequestBO convertBO(SrmPurchaseRequestItemsBO itemsBO) {
        if (itemsBO == null || itemsBO.getPurchaseRequest() == null) {
            return null;
        }
        // 1. 创建BO对象
        SrmPurchaseRequestBO bo = new SrmPurchaseRequestBO();

        // 2. 复制主表属性
        BeanUtils.copyProperties(itemsBO.getPurchaseRequest(), bo);

        // 3. 设置子表列表（当前子表）
        bo.setItems(Collections.singletonList(itemsBO));

        return bo;
    }
}
