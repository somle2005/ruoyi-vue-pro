package com.somle.esb.job;

import cn.iocoder.yudao.framework.tenant.core.context.TenantContextHolder;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.ErpShopSaveReqVO;
import cn.iocoder.yudao.module.erp.convert.shop.ErpShopConvert;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.module.erp.service.shop.ErpShopService;
import cn.iocoder.yudao.module.erp.service.shop.product.ErpShopProductService;
import com.somle.esb.converter.shop.AbstractErpShopProfileConverter;
import com.somle.esb.enums.TenantId;
import com.somle.esb.platform.shop.ShopProfileClient;
import com.somle.framework.common.concurrent.AsyncTask;
import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import com.somle.esb.model.ShopProfileDTO;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import com.somle.framework.common.util.collection.StreamX;

import java.util.*;
import java.util.stream.Collectors;

/**
* @Author LeeFJ
* @Description 将店铺信息同步到本地系统
* @Date 17:25 2025/2/7
* @Param
* @return
**/

@Slf4j
@Component
public class SyncShopProfileJob extends DataJob {



    @Resource
    private ApplicationContext applicationContext;

    @Resource
    private ErpShopService shopService;

    @Resource
    private ErpShopProductService shopProductService;

    @PostConstruct
    public void init() {

    }

    @Override
    public String execute(String param) throws Exception {

        Map<String, ShopProfileClient> shopProfileClients = applicationContext.getBeansOfType(ShopProfileClient.class);
        Map<SalesPlatform,ShopProfileClient> shopProfileClientMap=shopProfileClients.values().stream()
            .collect(Collectors.toMap(t->t.getSalesPlatform(), t -> t));

        for (final SalesPlatform salesPlatform : SalesPlatform.values()) {
            // 如果未开启同步则跳过
            if (!salesPlatform.isSyncProfile()) {
                continue;
            }
            AsyncTask.run(()->{
                try {
                    syncShopProfile(salesPlatform,shopProfileClientMap);
                } catch (Exception e) {
                    log.error("sync shop profile error",e);
                }
            });
        }
        return "syncing shop profile";
    }


    private void syncShopProfile(SalesPlatform salesPlatform,Map<SalesPlatform,ShopProfileClient> shopProfileClientMap) {

        TenantContextHolder.setTenantId(TenantId.DEFAULT.getId());

        ShopProfileClient shopProfileClient=shopProfileClientMap.get(salesPlatform);
        if(shopProfileClient==null) {
            log.error( salesPlatform.name() + " 店铺信息客户端未实现，请参考 ShopProfileClient 实现");
            return;
        }
        // 获取店铺信息
        JSONObject shopJson = shopProfileClient.getShop();
        if(shopJson==null) {
            throw new RuntimeException("缺少店铺信息JSON");
        }
        // 转换VO
        ShopProfileDTO<JSONObject> shopprofileDTO=new ShopProfileDTO(salesPlatform, ShopProfileType.SHOP,shopJson);
        ErpShopSaveReqVO shopVO= AbstractErpShopProfileConverter.convert(shopprofileDTO);

        if(shopVO==null) {
            throw new RuntimeException("缺少店铺信息VO");
        }
        // 保存店铺
        ErpShopDO shopDO=shopService.getByPlatform(shopprofileDTO.getSalesPlatform().name(),shopVO.getPlatformShopUid());
        if(shopDO!=null) {
            ErpShopSaveReqVO convertedShopVO = ErpShopConvert.INSTANCE.convert(shopDO);
            convertedShopVO.setName(shopVO.getName());
            shopService.updateShop(convertedShopVO);
        } else {
            shopService.createShop(shopVO);
            shopDO=shopService.getByPlatform(shopprofileDTO.getSalesPlatform().name(),shopVO.getPlatformShopUid());
        }

        // 获得产品信息
        JSONArray productArray = shopProfileClient.getProducts();
        if(productArray!=null && !productArray.isEmpty()) {
            syncShopProducts(salesPlatform,shopDO,productArray);
        }



    }

    /**
     * 同步店铺商品信息
     */
    private void syncShopProducts(SalesPlatform salesPlatform,ErpShopDO shopDO, JSONArray productArray) {
        ShopProfileDTO<JSONArray> shopProductsDTO=new ShopProfileDTO(salesPlatform, ShopProfileType.PRODUCT,productArray);
        // 转换
        List<ErpShopProductDO> productsFromShopify= AbstractErpShopProfileConverter.convert(shopProductsDTO);
        // 装配
        List<ErpShopProductDO> shopProductsInDB= shopProductService.selectByShopId(shopDO.getId());
        Map<String,ErpShopProductDO> shopProductsInDBMap= StreamX.from(shopProductsInDB).toMap
                (ErpShopProductDO::getPlatformProductUid,t->t);


        Map<String,ErpShopProductDO> mapToOffline=new HashMap<>(shopProductsInDBMap);
        List<ErpShopProductDO> listToCreate=new ArrayList<>();
        List<ErpShopProductDO> listToUpdate=new ArrayList<>();
        for (ErpShopProductDO productFromShopify : productsFromShopify) {

            ErpShopProductDO productDOInDB=shopProductsInDBMap.get(productFromShopify.getPlatformProductUid());

            // 默认有效状态
            productFromShopify.setStatus(1);

            if(productDOInDB==null) {
                productFromShopify.setShopId(shopDO.getId());
                productFromShopify.setCode(shopDO.getId()+"-"+productFromShopify.getPlatformProductUid());
                listToCreate.add(productFromShopify);

            } else {
                // 设置允许同步更新的属性，按需要补充
                productDOInDB.setName(productFromShopify.getName());
                listToUpdate.add(productDOInDB);
            }

            mapToOffline.remove(productFromShopify.getPlatformProductUid());
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