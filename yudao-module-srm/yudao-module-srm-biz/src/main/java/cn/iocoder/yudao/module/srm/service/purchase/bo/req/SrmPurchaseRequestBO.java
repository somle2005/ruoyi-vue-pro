package cn.iocoder.yudao.module.srm.service.purchase.bo.req;

import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseRequestDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseRequestItemsDO;
import lombok.Data;

import java.util.List;

/**
 * 采购申请单BO
 */
@Data
public class SrmPurchaseRequestBO extends SrmPurchaseRequestDO {

    /**
     * 采购申请单子表
     */
    private List<SrmPurchaseRequestItemsDO> srmPurchaseRequestItemsDOList;
}
