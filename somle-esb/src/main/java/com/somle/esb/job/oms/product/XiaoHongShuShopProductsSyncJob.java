package com.somle.esb.job.oms.product;

import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductSaveReqDTO;
import com.somle.esb.converter.oms.XiaoHongShuToOmsConverter;
import com.somle.xiaohongshu.service.XiaoHongShuService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class XiaoHongShuShopProductsSyncJob extends BaseShopProductsSyncJob{

    @Resource
    private XiaoHongShuService xiaoHongShuService;
    @Resource
    private XiaoHongShuToOmsConverter xiaoHongShuToOmsConverter;
    @Override
    public List<OmsShopProductSaveReqDTO> listProducts() {
        return xiaoHongShuService.clients.stream()
            .flatMap(client -> xiaoHongShuToOmsConverter.toProducts(client.getAllProducts(), client.getXiaoHongShuAccount()).stream())
            .toList();
    }
}
