package com.somle.esb.job.oms.shop;


import cn.iocoder.yudao.module.oms.dal.dataobject.OmsShopDO;
import cn.iocoder.yudao.module.oms.service.OmsShopService;
import com.alibaba.fastjson.JSONObject;
import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.platform.shop.ShopProfileClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Component
public class SyncWalmartShopProductsJob extends SyncShopProductsJob{


    @Override
    public String execute(String param) throws Exception {


        if ("WALMART".equals(shopDO.getPlatName())) {
            salesPlatform = SalesPlatform.WALMART;
        }

        // 获得所有注册的 ShopProfileClient 类型的 Spring Bean
        Map<String, ShopProfileClient> shopProfileClients = applicationContext.getBeansOfType(ShopProfileClient.class);
        Map<SalesPlatform,ShopProfileClient> shopProfileClientMap=shopProfileClients.values().stream()
            .collect(Collectors.toMap(t->t.getSalesPlatform(), t -> t));

        List<JSONObject> productArray = shopProfileClientMap.get(salesPlatform).getProducts(shopDO.getPlatformShopUid(), shopDO.getRegionCode(), shopDO.getDomainName());
        syncShopProducts(salesPlatform,shopDO,productArray);
        return "sync product success!";
    }
}
