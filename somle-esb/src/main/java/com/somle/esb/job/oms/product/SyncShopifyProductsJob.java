package com.somle.esb.job.oms.product;

import cn.iocoder.yudao.module.oms.enums.SalesPlatformEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SyncShopifyProductsJob extends SyncProductsJob {
    @Override
    public String execute(String param) throws Exception {

        syncShopProductProfile(SalesPlatformEnum.SHOPIFY, syncOmsClientMap);

        return "sync shopify products success!";
    }
}
