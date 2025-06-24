package com.somle.esb.job.oms.shop;

import cn.iocoder.yudao.module.oms.api.dto.OmsShopSaveReqDTO;
import com.somle.esb.converter.oms.WangdianToOmsConverter;
import com.somle.wangdian.service.WangdianService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WangdianShopsSyncJob extends BaseShopsSyncJob{
    @Resource
    private WangdianService wangdianService;
    @Resource
    private WangdianToOmsConverter wangdianToOmsConverter;
    @Override
    public List<OmsShopSaveReqDTO> listShops() {
        return wangdianService.clients.stream()
            .flatMap(client -> wangdianToOmsConverter.toShops(client.getShopInfo()).stream())
            .toList();
    }
}
