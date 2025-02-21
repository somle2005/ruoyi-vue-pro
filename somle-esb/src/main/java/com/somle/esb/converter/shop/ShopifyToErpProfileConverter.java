package com.somle.esb.converter.shop;

import cn.iocoder.yudao.framework.common.util.json.JSONArray;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.lang.string.CharSymbols;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.ErpShopSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.module.erp.enums.ErpOffStatus;
import cn.iocoder.yudao.module.erp.enums.ErpProductListingStatus;
import cn.iocoder.yudao.module.erp.enums.ErpShopType;
import cn.iocoder.yudao.module.system.api.dict.DictDataApi;
import com.fasterxml.jackson.databind.JsonNode;
import com.somle.esb.enums.ESBConstants;
import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import com.somle.esb.model.ShopProfileDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: ShopifyConverter
 * @author: LeeFJ
 * @date: 2025/2/8 9:22
 * @Version: 1.0
 * @description:
 */
public abstract class ShopifyToErpProfileConverter<IN,OUT> extends AbstractErpShopProfileConverter<IN,OUT> {

    public static final String FIELD_DOMAIN = "domain";
    public static final String FIELD_TITLE = "title";
    public static final String FIELD_ID = "id";
    public static final String FIELD_IMAGE = "image";
    public static final String FIELD_SRC = "src";
    public static final String FIELD_HANDLE = "handle";
    public static final String SUB_PATH_PRODUCTS = "/products/";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_COUNTRY = "country";
    public static final String FIELD_CURRENCY = "currency";
    public static final String FIELD_PRICE = "price";
    public static final String QUERY_STRING_VAR_VARIANT = "variant";
    public static final String FIELD_VARIANTS = QUERY_STRING_VAR_VARIANT + "s";
    public static final String FIELD_CREATED_AT = "created_at";
    public static final String FIELD_SKU = "sku";
    public static final String FIELS_STATUS = "status";
    public static final String VALUE_ACTIVE = "active";


    public ShopifyToErpProfileConverter(ShopProfileType shopProfileType) {
        super(SalesPlatform.SHOPIFY, shopProfileType);
    }

    public static LocalDateTime toLocalDateTime(String dateStr) {

        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        // 解析字符串为 ZonedDateTime 对象
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateStr, formatter);
        // 将 ZonedDateTime 转换为 Date 对象
        return zonedDateTime.toLocalDateTime();

    }

    @Component
    private static class ShopifyShopConverter extends ShopifyToErpProfileConverter<List<JSONObject>,ErpShopSaveReqVO> {



        public ShopifyShopConverter() {
            super(ShopProfileType.SHOP);
        }

        @Override
        protected List<ErpShopSaveReqVO> toModelInternal(ShopProfileDTO<List<JSONObject>> shopInfoDTO) {
            List<JSONObject> shopList = shopInfoDTO.getPayload();
            List<ErpShopSaveReqVO> returnList=new ArrayList<>();
            for (JSONObject shopJson : shopList) {
                String domain=shopJson.getString(FIELD_DOMAIN);
                ErpShopSaveReqVO shopDo = new ErpShopSaveReqVO();
                shopDo.setId(null);
                shopDo.setName(shopJson.getString(FIELD_NAME));
                shopDo.setRemark(null);
                shopDo.setDomainName(domain);
                shopDo.setOpenTime(toLocalDateTime(shopJson.getString(FIELD_CREATED_AT)));
                shopDo.setSort(1);
                shopDo.setStatus(ErpOffStatus.OPEN.getCode());
                shopDo.setType(ErpShopType.ONLINE.getCode());
                shopDo.setCountryCode(getCountryDictValue(shopJson.getString(FIELD_COUNTRY)));
                shopDo.setPlatform(SalesPlatform.SHOPIFY.name());
                shopDo.setPlatformShopUid(shopJson.getString(FIELD_ID));
                shopDo.setAccount(ESBConstants.VALUE_UNKNOWN);
                shopDo.setCode(shopDo.getPlatform()+"-"+shopDo.getPlatformShopUid());
                returnList.add(shopDo);
            }
            return returnList;
        }
    }

    @Component
    private static class ShopifyShopProductConverter extends ShopifyToErpProfileConverter<List<JSONObject>, ErpShopProductDO> {




        public ShopifyShopProductConverter() {
            super(ShopProfileType.PRODUCT);
        }

        @Override
        protected List<ErpShopProductDO> toModelInternal(ShopProfileDTO<List<JSONObject>> shopInfoDTO) {
            List<JSONObject> productArr = shopInfoDTO.getPayload();
            List<ErpShopProductDO> productList=new ArrayList<>();

            for (JSONObject productJson : productArr) {

                JSONArray variants = productJson.getJSONArray(FIELD_VARIANTS);
                for (JsonNode variant : variants) {
                    JSONObject variantJson = new JSONObject(variant);
                    String variantId=variantJson.getString(FIELD_ID);
                    String sku=variantJson.getString(FIELD_SKU);
                    ErpShopProductDO productDO = new ErpShopProductDO();
                    String domain=productJson.getString(FIELD_DOMAIN);
                    productDO.setId(null);
                    productDO.setName(sku);
                    productDO.setCurrency(productJson.getString(FIELD_CURRENCY));
                    productDO.setPrice(variantJson.getBigDecimal(FIELD_PRICE));
                    productDO.setCode(null);
                    productDO.setRemark(null);

                    productDO.setListingTime(toLocalDateTime(productJson.getString(FIELD_CREATED_AT)));

                    productDO.setPlatformProductUid(productJson.getString(FIELD_ID)+CharSymbols.MINUS+variantId);
                    String status = productJson.getString(FIELS_STATUS);
                    if(status.equals(VALUE_ACTIVE)) {
                        productDO.setStatus(ErpProductListingStatus.ONLINE.getCode());
                    } else {
                        productDO.setStatus(ErpProductListingStatus.OFFLINE.getCode());
                    }

                    productDO.setShopId(null);
                    productDO.setUrl(ESBConstants.PROTOCOL_HTTPS +domain+ SUB_PATH_PRODUCTS +productJson.getString(FIELD_HANDLE)+CharSymbols.QUESTION+ QUERY_STRING_VAR_VARIANT + CharSymbols.EQ +variantId);

                    JSONObject image=productJson.getJSONObject(FIELD_IMAGE);
                    if(image!=null) {
                        productDO.setImage(image.getString(FIELD_SRC));
                    }

                    productList.add(productDO);

                }


            }

            return productList;
        }



    }


}
