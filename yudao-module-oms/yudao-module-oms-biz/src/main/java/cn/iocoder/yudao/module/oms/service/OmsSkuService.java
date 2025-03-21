package cn.iocoder.yudao.module.oms.service;

import cn.iocoder.yudao.module.oms.model.entity.OmsShop;
import cn.iocoder.yudao.module.oms.model.entity.OmsSku;

import java.util.List;

public interface OmsSkuService {

    List<OmsSku> insertOrUpdateOmsSku(OmsShop omsShop, List<OmsSku> doDBOmsSkus);

}
