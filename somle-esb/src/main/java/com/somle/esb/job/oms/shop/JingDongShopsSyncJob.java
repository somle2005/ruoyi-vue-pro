package com.somle.esb.job.oms.shop;

import cn.iocoder.yudao.module.oms.api.dto.OmsShopSaveReqDTO;
import com.somle.esb.converter.oms.JingDongToOmsConverter;
import com.somle.jingdong.service.JingDongService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JingDongShopsSyncJob extends BaseShopsSyncJob {
    @Resource
    JingDongService  jingDongService;
    @Resource
    JingDongToOmsConverter jingDongToOmsConverter;


    @Override
    public List<OmsShopSaveReqDTO> listShops() {
        return jingDongService.jingDongClients.stream()
            .map(client -> jingDongToOmsConverter.toShops(client.getShopInfo()))
            .toList();
    }
}
