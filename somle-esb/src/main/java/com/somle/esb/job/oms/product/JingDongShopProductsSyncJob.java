package com.somle.esb.job.oms.product;

import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductSaveReqDTO;
import com.somle.esb.converter.oms.JingDongToOmsConverter;
import com.somle.jingdong.service.JingDongService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JingDongShopProductsSyncJob extends BaseShopProductsSyncJob{
    @Resource
    JingDongService jingDongService;
    @Resource
    JingDongToOmsConverter jingDongToOmsConverter;
    @Override
    public List<OmsShopProductSaveReqDTO> listProducts() {
        return jingDongService.jingDongClients.stream()
            .flatMap(client -> jingDongToOmsConverter.toProducts(client.getAllProduct(), client).stream())
            .toList();
    }
}
