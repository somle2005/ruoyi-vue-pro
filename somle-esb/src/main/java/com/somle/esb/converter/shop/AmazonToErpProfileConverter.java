package com.somle.esb.converter.shop;

import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.ErpShopSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import com.fasterxml.jackson.databind.JsonNode;
import com.somle.amazon.controller.vo.AmazonSpMarketplaceParticipationVO;
import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import com.somle.esb.model.ShopProfileDTO;
import com.somle.framework.common.util.collection.CollectionUtils;
import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
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
abstract class AmazonToErpProfileConverter<IN,OUT> extends AbstractErpShopProfileConverter<IN,OUT> {

    public AmazonToErpProfileConverter(ShopProfileType shopProfileType) {
        super(SalesPlatform.AMAZON, shopProfileType);
    }

    @Component
    private static class ShopifyShopConverter extends AmazonToErpProfileConverter<List<AmazonSpMarketplaceParticipationVO>,ErpShopSaveReqVO> {

        public ShopifyShopConverter() {
            super(ShopProfileType.SHOP);
        }

        @Override
        protected List<ErpShopSaveReqVO> toModelInternal(ShopProfileDTO<List<AmazonSpMarketplaceParticipationVO>> shopInfoDTO) {
            List<AmazonSpMarketplaceParticipationVO> shopList = shopInfoDTO.getPayload();
            List<ErpShopSaveReqVO> returnList=new ArrayList<>();
            for (AmazonSpMarketplaceParticipationVO amazonShop : shopList) {
                ErpShopSaveReqVO shopDo = new ErpShopSaveReqVO();
                shopDo.setId(null);
                shopDo.setName(amazonShop.getStoreName());
                shopDo.setDomainName(amazonShop.getMarketplace().getDomainName());
                shopDo.setRemark(null);
                shopDo.setSort(1);
                shopDo.setStatus(1);
                shopDo.setType(0);
                shopDo.setCountryCode(amazonShop.getMarketplace().getCountryCode());
                shopDo.setPlatform(SalesPlatform.AMAZON.name());
                shopDo.setPlatformShopUid(amazonShop.getMarketplace().getId());
                shopDo.setAccount("unknown");
                shopDo.setCode(shopDo.getPlatform()+"-"+shopDo.getPlatformShopUid());
                returnList.add(shopDo);
            }
            return returnList;
        }
    }

    @Component
    private static class ShopifyShopProductConverter extends AmazonToErpProfileConverter<List<JSONObject>, ErpShopProductDO> {

        public ShopifyShopProductConverter() {
            super(ShopProfileType.PRODUCT);
        }

        @Override
        protected List<ErpShopProductDO> toModelInternal(ShopProfileDTO<List<JSONObject>> shopInfoDTO) {
            List<JSONObject> productArr = shopInfoDTO.getPayload();
            List<ErpShopProductDO> productList=new ArrayList<>();

            for (JSONObject product : productArr) {
                //JSONArray offers=productJson.getJSONArray("offers");
                //for (JsonNode offerNode : offers) {
                    //JSONObject offer = new JSONObject(offerNode);
                    //JSONObject audience=offer.getJSONObject("audience");
                String sku=product.getString("sku");
                String domainName=product.getString("domainName");
                JSONObject catalog = product.getJSONObject("catalog");
                if(catalog==null) {
                    // 这个问题需要排查
                    continue;
                }
                String asin=catalog.getString("asin");
                JSONArray images=catalog.getJSONArray("images");
                String imageUrl=null;
                if(!CollectionUtils.isEmpty(images)) {
                    imageUrl=images.getJSONObject(0).getString("url");
                }

                ErpShopProductDO productDO = new ErpShopProductDO();
                productDO.setId(null);
                productDO.setName(sku);

                productDO.setCode(null);
                productDO.setRemark(null);

                productDO.setPlatformProductUid(sku+"#"+asin);

                productDO.setStatus(1);
                productDO.setShopId(null);
                productDO.setUrl("https://"+domainName+"/dp/"+asin);
                productDO.setImage(imageUrl);

                productList.add(productDO);
            }

            return productList;
        }

    }


}
