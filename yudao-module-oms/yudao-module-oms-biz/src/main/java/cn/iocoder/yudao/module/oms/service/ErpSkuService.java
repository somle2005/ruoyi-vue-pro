package cn.iocoder.yudao.module.oms.service;

import cn.iocoder.yudao.module.oms.model.entity.ErpShop;
import cn.iocoder.yudao.module.oms.model.entity.ErpSku;

import java.util.List;

public interface ErpSkuService {

    List<ErpSku> insertOrUpdateErpSku(ErpShop erpShop, List<ErpSku> doDBErpSkus);

}
