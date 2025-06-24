package com.somle.esb.job.oms.shop;

import cn.iocoder.yudao.module.oms.api.dto.OmsShopSaveReqDTO;
import com.somle.esb.converter.oms.XiaoHongShuToOmsConverter;
import com.somle.xiaohongshu.service.XiaoHongShuService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class XiaoHongShuShopsSyncJob extends BaseShopsSyncJob{
    @Resource
    private XiaoHongShuService xiaoHongShuService;
    @Resource
    private XiaoHongShuToOmsConverter xiaoHongShuToOmsConverter;
    @Override
    public List<OmsShopSaveReqDTO> listShops() {
        return xiaoHongShuService.clients.stream()
            .map(client -> xiaoHongShuToOmsConverter.toShops(client.getXiaoHongShuAccount()))
            .toList();
    }
}
