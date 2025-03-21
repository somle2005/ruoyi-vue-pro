package cn.iocoder.yudao.module.oms.service;

import cn.iocoder.yudao.module.oms.model.dto.ErpSkuImageDto;
import cn.iocoder.yudao.module.oms.model.entity.ErpShop;
import cn.iocoder.yudao.module.oms.model.entity.ErpSku;
import cn.iocoder.yudao.module.oms.model.entity.ErpSkuImage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface ErpSkuImageService extends IService<ErpSkuImage>{

    void insertOrUpdateErpSkuImage(ErpShop erpShop, List<ErpSkuImageDto> erpSkuImageDtos, Map<String, ErpSku> allSkuMap);
}
