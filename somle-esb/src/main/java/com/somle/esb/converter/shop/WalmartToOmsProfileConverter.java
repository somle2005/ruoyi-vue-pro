package com.somle.esb.converter.shop;


import cn.iocoder.yudao.framework.common.util.json.JSONArray;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.string.CharSymbols;
import cn.iocoder.yudao.module.oms.controller.admin.shop.ErpShopSaveReqVO;
import cn.iocoder.yudao.module.oms.dal.dataobject.ErpShopProductDO;
import cn.iocoder.yudao.module.oms.enums.ESBConstants;
import cn.iocoder.yudao.module.oms.enums.ErpOffStatus;
import cn.iocoder.yudao.module.oms.enums.ErpProductListingStatus;
import cn.iocoder.yudao.module.oms.enums.ErpShopType;
import com.fasterxml.jackson.databind.JsonNode;
import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import com.somle.esb.model.ShopProfileDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class WalmartToOmsProfileConverter<IN,OUT> extends AbstractErpShopProfileConverter<IN,OUT> {


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
    public static final String FIELDS_STATUS = "status";
    public static final String VALUE_ACTIVE = "active";

    protected WalmartToOmsProfileConverter(ShopProfileType shopInfoType) {
        super(SalesPlatform.WALMART, shopInfoType);
    }


    public static LocalDateTime toLocalDateTime(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        // 解析字符串为 ZonedDateTime 对象
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateStr, formatter);
        // 将 ZonedDateTime 转换为 Date 对象
        return zonedDateTime.toLocalDateTime();

    }



    @Component
    private static class WalmartShopProductConverter extends WalmartToOmsProfileConverter<List<JSONObject>, ErpShopProductDO> {



        public WalmartShopProductConverter() {
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
                    String status = productJson.getString(FIELDS_STATUS);
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
