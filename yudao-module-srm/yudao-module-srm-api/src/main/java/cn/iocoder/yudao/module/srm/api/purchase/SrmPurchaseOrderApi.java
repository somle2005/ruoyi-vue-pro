package cn.iocoder.yudao.module.srm.api.purchase;

import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderDTO;

import java.util.List;
import java.util.Set;

/**
 * 采购订单 API 接口
 */
public interface SrmPurchaseOrderApi {

    /**
     * 获得采购订单列表
     *
     * @param ids 采购订单编号列表
     * @return 采购订单列表
     */
    List<SrmPurchaseOrderDTO> getPurchaseOrderList(List<Long> ids);

    /**
     * 验证采购订单ID是否存在
     *
     * @param ids 采购订单编号集合
     * @return 存在的采购订单列表
     */
    List<SrmPurchaseOrderDTO> validatePurchaseOrderIds(Set<Long> ids);
} 