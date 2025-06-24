package com.somle.esb.job.oms.product;

import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductSaveReqDTO;
import com.somle.esb.converter.oms.WangdianToOmsConverter;
import com.somle.wangdian.service.WangdianService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WangdianShopProductsSyncJob extends BaseShopProductsSyncJob{
    @Resource
    private WangdianService wangdianService;
    @Resource
    private WangdianToOmsConverter wangdianToOmsConverter;
    @Override
    public List<OmsShopProductSaveReqDTO> listProducts() {
        return wangdianService.clients.stream()
            .flatMap(client -> wangdianToOmsConverter.toProducts(client.getAllProduct()).stream())
            .toList();
    }
}
