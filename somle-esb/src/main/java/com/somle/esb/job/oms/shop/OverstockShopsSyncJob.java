package com.somle.esb.job.oms.shop;

import cn.iocoder.yudao.module.oms.api.dto.OmsShopSaveReqDTO;
import com.somle.esb.converter.oms.OverstockToOmsConverter;
import com.somle.overstock.service.OverstockService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class OverstockShopsSyncJob extends BaseShopsSyncJob {

    @Resource
    private OverstockService overstockService;
    @Resource
    private OverstockToOmsConverter converter;
    @Override
    public List<OmsShopSaveReqDTO> listShops() {
        return overstockService.clients.stream().map(client -> converter.toShops(client.getAccount())).toList();
    }
}
