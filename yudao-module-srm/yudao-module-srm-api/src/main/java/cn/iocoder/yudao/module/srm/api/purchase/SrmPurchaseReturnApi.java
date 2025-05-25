package cn.iocoder.yudao.module.srm.api.purchase;

import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseReturnDTO;

import java.math.BigDecimal;
import java.util.List;

/**
 * 采购退货单 API 接口
 */
public interface SrmPurchaseReturnApi {

    /**
     * 获得采购退货单列表
     *
     * @param ids 采购退货单编号列表
     * @return 采购退货单列表
     */
    List<SrmPurchaseReturnDTO> getPurchaseReturnList(List<Long> ids);


    /**
     * 状态机-变动退货项-退货数量
     *
     * @param returnItemId 采购退货明细编号(上游明细ID)
     * @param qty          退货数量(正进-负减)
     */
    void updatePurchaseReturnItemQty(Long returnItemId, BigDecimal qty);
} 