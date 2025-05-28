package cn.iocoder.yudao.module.srm.api.purchase;

import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseInDTO;

import java.util.List;

/**
 * 采购入库单 API 接口
 */
public interface SrmPurchaseInApi {

    /**
     * 获得采购入库单列表
     *
     * @param ids 采购入库单编号列表
     * @return 采购入库单列表
     */
    List<SrmPurchaseInDTO> getPurchaseInList(List<Long> ids);

    /**
     * 状态机-变动入库项-入库数量
     *
     */
    void updatePurchaseInItemQty();

} 