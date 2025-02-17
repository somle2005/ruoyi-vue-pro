package com.somle.esb.converter.shop;

import cn.iocoder.yudao.framework.common.util.lang.string.CharSymbols;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.ErpShopSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.module.erp.enums.ErpOffStatus;
import cn.iocoder.yudao.module.erp.enums.ErpShopType;
import com.fasterxml.jackson.databind.JsonNode;
import com.somle.amazon.controller.vo.AmazonSpMarketplaceParticipationVO;
import com.somle.esb.enums.ESBConstants;
import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import com.somle.esb.model.ShopProfileDTO;
import com.somle.framework.common.util.collection.CollectionUtils;
import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: ShopifyConverter
 * @author: LeeFJ
 * @date: 2025/2/8 9:22
 * @Version: 1.0
 * @description:
 */
public abstract class AmazonToErpProfileConverter<IN,OUT> extends AbstractErpShopProfileConverter<IN,OUT> {

    public static final String FIELD_NUMBER_OF_RESULTS = "numberOfResults";
    public static final String FIELD_PAGINATION = "pagination";
    public static final String FIELD_NEXT_TOKEN = "nextToken";
    public static final String FIELD_ERRORS = "errors";
    public static final String FIELD_CODE = "code";
    public static final String FIELD_CATALOG = "catalog";
    public static final String FIELD_ITEMS = "items";
    public static final String FIELD_DOMAIN_NAME = "domainName";
    public static final String FIELD_ASIN = "asin";
    public static final String FIELD_IMAGES = "images";
    public static final String FIELD_SKU = "sku";
    public static final String FIELD_LINK = "link";
    public static final String FIELD_PRICE = "price";
    public static final String FIELD_MARKETPLACE_ID = "marketplaceId";
    public static final String FIELD_CLIENT_ID = "clientId";
    public static final String FIELD_SELLER_ID = "sellerId";
    public static final String SUB_PATH_DP = "/dp/";
    public static final String FIELD_OFFERS = "offers";
    public static final String FIELD_OFFER_TYPE = "offerType";
    public static final String FIELD_AMOUNT = "amount";
    public static final String FIELD_CURRENCY = "currency";
    public static final String VALUE_B2C = "B2C";

    public AmazonToErpProfileConverter(ShopProfileType shopProfileType) {
        super(SalesPlatform.AMAZON, shopProfileType);
    }

    @Slf4j
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
                shopDo.setStatus(ErpOffStatus.OPEN.getCode());
                shopDo.setType(ErpShopType.ONLINE.getCode());
                shopDo.setCountryCode(amazonShop.getMarketplace().getCountryCode());
                shopDo.setPlatform(SalesPlatform.AMAZON.name());
                shopDo.setPlatformShopUid(amazonShop.getMarketplace().getId());
                shopDo.setAccount(ESBConstants.VALUE_UNKNOWN);
                shopDo.setCode(shopDo.getPlatform()+CharSymbols.MINUS+shopDo.getPlatformShopUid());
                returnList.add(shopDo);
            }
            return returnList;
        }
    }

    @Component
    @Slf4j
    private static class ShopifyShopProductConverter extends AmazonToErpProfileConverter<List<JSONObject>, ErpShopProductDO> {



        public ShopifyShopProductConverter() {
            super(ShopProfileType.PRODUCT);
        }

        @Override
        protected List<ErpShopProductDO> toModelInternal(ShopProfileDTO<List<JSONObject>> shopInfoDTO) {
            List<JSONObject> productArr = shopInfoDTO.getPayload();
            List<ErpShopProductDO> productList=new ArrayList<>();

            for (JSONObject product : productArr) {

                String sku=product.getString(FIELD_SKU);
                String domainName=product.getString(FIELD_DOMAIN_NAME);
                JSONObject catalog = product.getJSONObject(FIELD_CATALOG);
                String asin= ESBConstants.VALUE_NONE;
                String imageUrl=ESBConstants.VALUE_NONE;
                if(catalog!=null) {
                    asin=catalog.getString(FIELD_ASIN);
                    JSONArray images=catalog.getJSONArray(FIELD_IMAGES);
                    if(!CollectionUtils.isEmpty(images)) {
                        JSONObject marketplaceJSON=images.getJSONObject(0);
                        JSONArray marketplaceImages=marketplaceJSON.getJSONArray(FIELD_IMAGES);
                        if(!CollectionUtils.isEmpty(marketplaceImages)) {
                            imageUrl =marketplaceImages.getJSONObject(0).getString(FIELD_LINK);
                        }
                    }
                }

                ErpShopProductDO productDO = new ErpShopProductDO();
                productDO.setId(null);
                productDO.setName(sku);

                JSONArray offers=product.getJSONArray(FIELD_OFFERS);
                if(!CollectionUtils.isEmpty(offers)) {
                    for (JsonNode offer : offers) {
                        JSONObject offerJson = new JSONObject(offer);
                        String offerType=offerJson.getString(FIELD_OFFER_TYPE);
                        if(VALUE_B2C.equals(offerType)) {
                            JSONObject priceJson = offerJson.getJSONObject(FIELD_PRICE);
                            if (priceJson != null) {
                                productDO.setPrice(priceJson.getBigDecimal(FIELD_AMOUNT));
                                productDO.setCurrency(priceJson.getString(FIELD_CURRENCY));
                            }
                        }
                    }
                }
                productDO.setCode(null);
                productDO.setRemark(null);

                productDO.setPlatformProductUid(sku+ CharSymbols.NU+asin);

                productDO.setStatus(ErpOffStatus.OPEN.getCode());
                productDO.setShopId(null);
                productDO.setUrl(ESBConstants.PROTOCOL_HTTPS +domainName+ SUB_PATH_DP +asin);
                productDO.setImage(imageUrl);

                productList.add(productDO);
            }

            return productList;
        }

    }


}
