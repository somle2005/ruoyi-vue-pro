package com.somle.esb.job.oms.product;

import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductSaveReqDTO;
import com.somle.doudian.service.DouDianService;
import com.somle.esb.converter.oms.DouDianToOmsConverter;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DouDianShopProductsSyncJob extends BaseShopProductsSyncJob{

    @Resource
    DouDianService douDianService;
    @Resource
    DouDianToOmsConverter douDianToOmsConverter;
    @Override
    public List<OmsShopProductSaveReqDTO> listProducts() {
        return douDianService.clients.stream()
            .flatMap(client -> douDianToOmsConverter.toProducts(client.getAllProducts(), client.getDouDianAccount()).stream())
            .toList();
    }
}
