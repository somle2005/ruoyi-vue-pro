package com.somle.esb.job;

import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.json.JSONArray;
import cn.iocoder.yudao.framework.common.util.lang.string.CharSymbols;
import cn.iocoder.yudao.framework.common.util.spring.SpringUtils;
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
import cn.iocoder.yudao.framework.common.util.concurrent.AsyncTask;
import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import com.somle.esb.model.ShopProfileDTO;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

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



    @Override
    public String execute(String param) throws Exception {

        // 获得所有注册的 ShopProfileClient 类型的 Spring Bean
        Map<String, ShopProfileClient> shopProfileClients = applicationContext.getBeansOfType(ShopProfileClient.class);
        Map<SalesPlatform,ShopProfileClient> shopProfileClientMap=shopProfileClients.values().stream()
            .collect(Collectors.toMap(t->t.getSalesPlatform(), t -> t));

        // 遍历所有销售平台
        for (final SalesPlatform salesPlatform : SalesPlatform.values()) {

            // 如果未开启同步则跳过
            if (!salesPlatform.isSyncProfile()) {
                continue;
            }

            // 如果是本地调试模式
            if(SpringUtils.isBootInIDE()) {
                // 调试指定的平台
                 if(!salesPlatform.isAnyMatch(SalesPlatform.SHOPIFY,SalesPlatform.AMAZON)) {
                 // if(!salesPlatform.isAnyMatch(SalesPlatform.SHOPIFY)) {
                 // if(!salesPlatform.isAnyMatch(SalesPlatform.AMAZON)) {
                    continue;
                }
            }

            // 异步并行处理各个平台数据
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


    /**
     * 同步指定平台的店铺资料
     **/
    private void syncShopProfile(SalesPlatform salesPlatform,Map<SalesPlatform,ShopProfileClient> shopProfileClientMap) {

        // 设置租户为默认租户
        TenantContextHolder.setTenantId(TenantId.DEFAULT.getId());
        // 按平台获取店铺资料对接的客户端类型
        ShopProfileClient<?,?> shopProfileClient=shopProfileClientMap.get(salesPlatform);
        if(shopProfileClient==null) {
            log.error( salesPlatform.name() + " 店铺信息客户端未实现，请参考 ShopProfileClient 实现");
            return;
        }

        // 获取店铺信息
        List<?> shops = shopProfileClient.getShops();
        // 同步店铺资料
        syncShops(salesPlatform,shops,shopProfileClient);
    }

    /**
     * 同步店铺资料
     **/
    private void syncShops(SalesPlatform salesPlatform,List<?> shops,ShopProfileClient<?,?> shopProfileClient) {

        if(CollectionUtils.isEmpty(shops)) {
            throw new RuntimeException("缺少店铺信息");
        }
        // 转换VO
        ShopProfileDTO<List<?>> shopProfileDTO=new ShopProfileDTO<>(salesPlatform, ShopProfileType.SHOP,shops);
        List<ErpShopSaveReqVO> shopVOs= AbstractErpShopProfileConverter.convert(shopProfileDTO);
        // 循环店铺
        for (ErpShopSaveReqVO shopVO : shopVOs) {

            if(shopVO==null) {
                throw new RuntimeException("缺少店铺信息VO");
            }
            // 保存店铺
            ErpShopDO shopDO=shopService.getByPlatform(shopProfileDTO.getSalesPlatform().name(),shopVO.getPlatformShopUid());
            if(shopDO!=null) {
                // 更新时设置的属性
                shopDO.setName(shopVO.getName());
                shopDO.setCountryCode(shopVO.getCountryCode());
                shopDO.setDomainName(shopVO.getDomainName());
                shopDO.setPlatformShopUid(shopVO.getPlatformShopUid());
                shopDO.setOpenTime(shopVO.getOpenTime());
                shopDO.setType(shopVO.getType());
                shopDO.setStatus(shopVO.getStatus());
                ErpShopSaveReqVO convertedShopVO = ErpShopConvert.INSTANCE.convert(shopDO);
                convertedShopVO.setOpenTime(shopVO.getOpenTime());
                // 更新
                shopService.updateShop(convertedShopVO);
            } else {
                // 创建
                shopService.createShop(shopVO);
                // 从数据库刷新 DO
                shopDO=shopService.getByPlatform(shopProfileDTO.getSalesPlatform().name(),shopVO.getPlatformShopUid());
            }

            // 拉取产品信息
            List<?> productArray = shopProfileClient.getProducts(shopDO.getPlatformShopUid(),shopDO.getCountryCode(),shopDO.getDomainName());
            if(productArray!=null && !productArray.isEmpty()) {
                //syncShopProducts(salesPlatform,shopDO,productArray);
            }

        }

        log.info("sync shop profile success,salesPlatform:{},shopCount:{}",salesPlatform.name(),shops.size());

    }

    /**
     * 同步店铺商品信息
     */
    private void syncShopProducts(SalesPlatform salesPlatform,ErpShopDO shopDO, List productArray) {
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