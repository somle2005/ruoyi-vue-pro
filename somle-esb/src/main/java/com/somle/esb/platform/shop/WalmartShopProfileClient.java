package com.somle.esb.platform.shop;

import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.module.oms.dal.dataobject.OmsShopDO;
import cn.iocoder.yudao.module.oms.service.OmsShopService;
import com.somle.esb.enums.SalesPlatform;
import com.somle.walmart.model.reps.WalmartAllItemsRepsVO;
import com.somle.walmart.model.req.WalmartAllItemsReqVO;
import com.somle.walmart.service.WalmartClient;
import com.somle.walmart.service.WalmartService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 沃尔玛数据同步客户端
 * @Description: Walmart Marketplace接口文档： https://developer.walmart.com/us-marketplace/reference/tokenapi
 * @Author: gumaomao
 * @Date: 2025/03/25
 */
@Slf4j
@Component
public class WalmartShopProfileClient  extends ShopProfileClient {


    @Resource
    private WalmartService walmartService;

    @Resource
    private OmsShopService omsShopService;


    public WalmartShopProfileClient() {
        super(SalesPlatform.WALMART);
    }


    @Override
    public List getShops() {
        return null;
    }


    @Override
    public List<JSONObject> getProducts(String shopPlatformUid, String regionCode, String domainName) {
        OmsShopDO omsShopDO = omsShopService.getByPlatformShopUid(shopPlatformUid);
        WalmartClient walmartClient = walmartService.getClient(omsShopDO.getAuthId());
        WalmartAllItemsReqVO walmartAllItemsReqVO = WalmartAllItemsReqVO.builder().offset(0).limit(500).build();
        List<JSONObject> allProducts = walmartClient.getAllProducts(walmartAllItemsReqVO);
        return allProducts;
    }

}
