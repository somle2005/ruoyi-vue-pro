package com.somle.esb.platform.shop;


import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Lists;
import com.somle.esb.converter.shop.AmazonToErpProfileConverter;
import com.somle.esb.converter.shop.ShopifyToErpProfileConverter;
import com.somle.esb.enums.SalesPlatform;
import com.somle.shopify.enums.ShopifyAPI;
import com.somle.shopify.model.ShopifyToken;
import com.somle.shopify.repository.ShopifyTokenRepository;
import com.somle.shopify.service.ShopifyClient;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
  *  Shopify 接口文档 <br>
  *  https://shopify.dev/docs/api/admin-rest/
  **/

@Slf4j
@Component
public class ShopifyShopProfileClient extends ShopProfileClient<JSONObject,JSONObject> {


    @Autowired
    private ShopifyClient client;

    public ShopifyShopProfileClient() {
        super(SalesPlatform.SHOPIFY);
    }



    private Map<String,JSONObject> shopMap = new HashMap<>();
    /**
     * 获得店铺信息
     **/
    public List<JSONObject> getShops() {
        List<JSONObject> shops=client.getShops();
        for (JSONObject shop : shops) {
            shopMap.put(shop.getString("id"),shop);
        }
        return shops;
    }


    /**
     * 获得商品信息
     **/
    public List<JSONObject> getProducts(String shopPlatformUid,String regionCode,String domainName) {
        Map<String,String> params = new HashMap<>();
        params.put("limit","250");
        List<JSONObject> list=client.getProducts(params);
        for(JSONObject product:list){
            product.put(ShopifyToErpProfileConverter.FIELD_DOMAIN, domainName);
            JSONObject shop=shopMap.get(shopPlatformUid);
            if(shop!=null) {
                product.put(ShopifyToErpProfileConverter.FIELD_CURRENCY, shop.getString(ShopifyToErpProfileConverter.FIELD_CURRENCY));
            }
        }
        return list;
    }


}



