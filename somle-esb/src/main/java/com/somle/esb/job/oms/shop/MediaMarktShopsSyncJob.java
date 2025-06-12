package com.somle.esb.job.oms.shop;

import cn.iocoder.yudao.module.oms.api.dto.OmsShopSaveReqDTO;
import com.somle.esb.converter.oms.MediaMarktToOmsConverter;
import com.somle.mediamarkt.service.MediaMarktService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MediaMarktShopsSyncJob extends BaseShopsSyncJob {
    @Resource
    MediaMarktService mediaMarktService;
    @Resource
    MediaMarktToOmsConverter mediaMarktToOmsConverter;

    @Override
    public List<OmsShopSaveReqDTO> listShops() {
        return mediaMarktService.clients.stream()
                .map(client -> mediaMarktToOmsConverter.toShops(client.getShopInformation()))
                .toList();
    }
}
