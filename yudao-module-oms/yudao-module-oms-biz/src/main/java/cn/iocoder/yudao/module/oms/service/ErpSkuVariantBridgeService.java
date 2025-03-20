package cn.iocoder.yudao.module.oms.service;

import cn.iocoder.yudao.module.oms.domain.dto.ErpSkuVariantBridgeDto;
import cn.iocoder.yudao.module.oms.domain.entity.ErpSkuVariantBridge;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ErpSkuVariantBridgeService extends IService<ErpSkuVariantBridge> {

    void insertOrUpdateErpSkuVariantBridge(String shopName, List<ErpSkuVariantBridgeDto> erpSkuVariantBridgeDtos);

}
