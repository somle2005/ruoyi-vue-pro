package com.somle.esb.job.oms.shop;

import cn.iocoder.yudao.module.oms.api.dto.OmsShopSaveReqDTO;
import com.somle.doudian.service.DouDianService;
import com.somle.esb.converter.oms.DouDianToOmsConverter;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DouDianShopsSyncJob extends BaseShopsSyncJob {
    @Resource
    DouDianService douDianService;
    @Resource
    DouDianToOmsConverter douDianToOmsConverter;

    @Override
    public List<OmsShopSaveReqDTO> listShops() {
        return douDianService.clients.stream()
            .map(client -> douDianToOmsConverter.toShops(client.getDouDianAccount()))
            .toList();
    }
}
