package cn.iocoder.yudao.module.srm.api.purchase;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderItemDTO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseOrderDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseOrderItemDO;
import cn.iocoder.yudao.module.srm.enums.SrmErrorCodeConstants;
import cn.iocoder.yudao.module.srm.service.purchase.SrmPurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertMap;

/**
 * 采购订单 API 实现类
 */
@Service
@Validated
public class SrmPurchaseOrderApiImpl implements SrmPurchaseOrderApi {

    @Autowired
    @Lazy
    private SrmPurchaseOrderService purchaseOrderService;


    @Override
    public List<SrmPurchaseOrderDTO> validatePurchaseOrderIds(Set<Long> ids) {
        // 1. 获取所有采购订单
        List<SrmPurchaseOrderDO> list = purchaseOrderService.getPurchaseOrderList(ids).stream().toList();
        // 2. 检查是否存在不存在的采购订单
        Map<Long, SrmPurchaseOrderDO> orderMap = convertMap(list, SrmPurchaseOrderDO::getId);
        List<Long> notExistIds = ids.stream()
            .filter(id -> !orderMap.containsKey(id))
            .collect(Collectors.toList());
        if (!notExistIds.isEmpty()) {
            throw exception(SrmErrorCodeConstants.PURCHASE_ORDER_NOT_EXISTS, notExistIds);
        }
        // 3. 转换为 DTO 并返回
        Map<Long, List<SrmPurchaseOrderItemDO>> map = purchaseOrderService.getPurchaseOrderItemListByOrderIds(ids).stream().collect(Collectors.groupingBy(SrmPurchaseOrderItemDO::getOrderId));
        return BeanUtils.toBean(list, SrmPurchaseOrderDTO.class,
            order -> order.setItems(BeanUtils.toBean(map.get(order.getId()), SrmPurchaseOrderItemDTO.class))
        );
    }

} 