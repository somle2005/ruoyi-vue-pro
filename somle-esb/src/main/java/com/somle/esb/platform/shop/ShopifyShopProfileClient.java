package com.somle.esb.platform.shop;


import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Lists;
import com.somle.esb.converter.shop.AmazonToErpProfileConverter;
import com.somle.esb.converter.shop.ShopifyToErpProfileConverter;
import com.somle.esb.enums.SalesPlatform;
import com.somle.framework.common.util.collection.CollectionUtils;
import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.common.util.json.JsonUtils;
import com.somle.framework.common.util.web.RequestX;
import com.somle.framework.common.util.web.WebUtils;
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




    /**
     * 获得店铺信息
     **/
    public List<JSONObject> getShops() {
        return client.getShops();
    }


    /**
     * 获得商品信息
     **/
    public List<JSONObject> getProducts(String shopId,String regionCode,String domainName) {
        Map<String,String> params = new HashMap<>();
        params.put("limit","250");
        List<JSONObject> list=client.getProducts(params);
        for(JSONObject product:list){
            product.put(ShopifyToErpProfileConverter.FIELD_DOMAIN, domainName);
        }
        return list;
    }


}



