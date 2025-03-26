package cn.iocoder.yudao.module.oms.service;

import cn.iocoder.yudao.module.oms.model.OmsShopDO;
import cn.iocoder.yudao.module.oms.model.OmsSkuDO;

import java.util.List;

public interface OmsSkuService {

    List<OmsSkuDO> insertOrUpdateOmsSku(OmsShopDO omsShopDO, List<OmsSkuDO> doDBOmsSkus);

}
