package com.somle.esb.converter.shop;

import cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo.ErpShopProductSaveReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.ErpShopSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import com.fasterxml.jackson.databind.JsonNode;
import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.domain.sales.SalesPlatform;
import com.somle.framework.domain.shop.ShopProfileType;
import com.somle.framework.domain.shop.model.ShopProfileDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: ShopifyConverter
 * @author: Wqh
 * @date: 2025/2/8 9:22
 * @Version: 1.0
 * @description:
 */
abstract class ShopifyProfileConverter<IN,OUT> extends ErpShopProfileConverter<IN,OUT> {

    public ShopifyProfileConverter(ShopProfileType shopProfileType) {
        super(SalesPlatform.SHOPIFY, shopProfileType);
    }

    @Component
    private static class ShopifyShopConverter extends ShopifyProfileConverter<JSONObject,ErpShopSaveReqVO> {

        public ShopifyShopConverter() {
            super(ShopProfileType.SHOP);
        }

        @Override
        protected ErpShopSaveReqVO toModelInternal(ShopProfileDTO<JSONObject> shopInfoDTO) {
            JSONObject shopJson = shopInfoDTO.getPayload();
            ErpShopSaveReqVO shopDo = new ErpShopSaveReqVO();
            shopDo.setId(null);
            shopDo.setName(shopJson.getString("name"));
            shopDo.setRemark(null);
            shopDo.setSort(1);
            shopDo.setStatus(1);
            shopDo.setType(0);
            shopDo.setPlatform(SalesPlatform.SHOPIFY.name());
            shopDo.setPlatformShopUid(shopJson.getString("id"));
            shopDo.setAccount("unknown");
            shopDo.setCode(shopDo.getPlatform()+"-"+shopDo.getPlatformShopUid());
            return shopDo;
        }
    }

    @Component
    private static class ShopifyShopProductConverter extends ShopifyProfileConverter<JSONArray, List<ErpShopProductDO>> {

        public ShopifyShopProductConverter() {
            super(ShopProfileType.PRODUCT);
        }

        @Override
        protected List<ErpShopProductDO> toModelInternal(ShopProfileDTO<JSONArray> shopInfoDTO) {
            JSONArray productArr = shopInfoDTO.getPayload();
            List<ErpShopProductDO> productList=new ArrayList<>();
            for (JsonNode productNode : productArr) {
                JSONObject productJson=new JSONObject(productNode);
                ErpShopProductDO productDO = new ErpShopProductDO();
                productDO.setId(null);
                productDO.setName(productJson.getString("title"));
                productDO.setCode(null);
                productDO.setRemark(null);
                productDO.setPlatformProductUid(productJson.getString("id"));
                productDO.setStatus(1);
                productDO.setShopId(null);
                productDO.setUrl(SalesPlatform.SHOPIFY.getSiteURL()+"/products/"+productJson.getString("handle"));
                productList.add(productDO);
            }
            return productList;
        }

    }


}
