package cn.iocoder.yudao.module.srm.service.purchase.bo.req;

import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseRequestDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseRequestItemsDO;
import lombok.Data;

@Data
public class SrmPurchaseRequestItemsBO extends SrmPurchaseRequestItemsDO {

    //主表
    private SrmPurchaseRequestDO purchaseRequestDO;
}
