package cn.iocoder.yudao.module.srm.api.purchase;

import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseReturnDTO;

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

} 