package com.somle.esb.job.common;


import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.json.JSONArray;
import cn.iocoder.yudao.framework.common.util.string.CharSymbols;
import cn.iocoder.yudao.module.oms.dal.dataobject.ErpShopProductDO;
import cn.iocoder.yudao.module.oms.dal.dataobject.OmsShopDO;
import cn.iocoder.yudao.module.oms.service.ErpShopProductService;
import cn.iocoder.yudao.module.oms.service.OmsShopService;
import com.alibaba.fastjson.JSONObject;
import com.somle.esb.converter.shop.AbstractErpShopProfileConverter;
import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import com.somle.esb.job.DataJob;
import com.somle.esb.model.ShopProfileDTO;
import com.somle.esb.platform.shop.ShopProfileClient;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Component
public class SyncShopProductsJob extends DataJob {


    @Resource
    private ApplicationContext applicationContext;

    @Resource
    private ErpShopProductService shopProductService;

    @Resource
    private OmsShopService omsShopService;


    @Override
    public String execute(String param) throws Exception {
        OmsShopDO shopDO = omsShopService.getByPlatformShopUid(param);
        SalesPlatform salesPlatform = null;
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

    /**
     * 同步店铺商品信息
     */
    public void syncShopProducts(SalesPlatform salesPlatform, OmsShopDO shopDO, List productArray) {
        ShopProfileDTO<JSONArray> shopProductsDTO=new ShopProfileDTO(salesPlatform, ShopProfileType.PRODUCT,productArray);
        // 转换
        List<ErpShopProductDO> productsSalesPlatform= AbstractErpShopProfileConverter.convert(shopProductsDTO);
        // 装配
        List<ErpShopProductDO> shopProductsInDB= shopProductService.selectByShopId(shopDO.getId());
        Map<String,ErpShopProductDO> shopProductsInDBMap= StreamX.from(shopProductsInDB).toMap
            (ErpShopProductDO::getPlatformProductUid,t->t);


        Map<String,ErpShopProductDO> mapToOffline=new HashMap<>(shopProductsInDBMap);
        List<ErpShopProductDO> listToCreate=new ArrayList<>();
        List<ErpShopProductDO> listToUpdate=new ArrayList<>();
        for (ErpShopProductDO productFromSalesPlatform : productsSalesPlatform) {

            ErpShopProductDO productDOInDB=shopProductsInDBMap.get(productFromSalesPlatform.getPlatformProductUid());

            // 默认有效状态
            productFromSalesPlatform.setStatus(1);

            if(productDOInDB==null) {
                productFromSalesPlatform.setShopId(shopDO.getId());
                productFromSalesPlatform.setCode(shopDO.getId()+ CharSymbols.NU +productFromSalesPlatform.getPlatformProductUid());
                listToCreate.add(productFromSalesPlatform);

            } else {
                // 设置允许同步更新的属性，按需要补充
                productDOInDB.setName(productFromSalesPlatform.getName());
                productDOInDB.setUrl(productFromSalesPlatform.getUrl());
                productDOInDB.setImage(productFromSalesPlatform.getImage());
                productDOInDB.setStatus(productFromSalesPlatform.getStatus());
                productDOInDB.setCurrency(productFromSalesPlatform.getCurrency());
                productDOInDB.setListingTime(productFromSalesPlatform.getListingTime());
                productDOInDB.setPrice(productFromSalesPlatform.getPrice());
                listToUpdate.add(productDOInDB);
            }
            // 移除有效的产品
            mapToOffline.remove(productFromSalesPlatform.getPlatformProductUid());
        }

        // 新增的部分
        if(!listToCreate.isEmpty()) {
            shopProductService.batchCreate(listToCreate);
        }
        // 更新的部分
        if(!listToUpdate.isEmpty()) {
            shopProductService.batchUpdate(listToUpdate);
        }

        // 下线失效的部分
        List<ErpShopProductDO> listToOffline=new ArrayList<>();
        for (ErpShopProductDO productDO : mapToOffline.values()) {
            productDO.setStatus(0);
            listToOffline.add(productDO);
        }
        if(!listToOffline.isEmpty()) {
            shopProductService.batchUpdate(listToOffline);
        }

    }

}
