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

public abstract class WalmartToOmsProfileConverter<IN, OUT> extends AbstractErpShopProfileConverter<IN, OUT> {


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
            List<ErpShopProductDO> productList = new ArrayList<>();

            for (JSONObject productJson : productArr) {
                ErpShopProductDO productDO = new ErpShopProductDO();
                productDO.setId(null);
                productDO.setName(productJson.getString("sku"));
                productDO.setPlatformProductUid(productJson.getString("sku"));
                productDO.setCode(productJson.getString("sku"));
                productDO.setStatus(ErpProductListingStatus.ONLINE.getCode());
                productDO.setShopId(1L);
                productList.add(productDO);
            }
            return productList;
        }
    }
}
