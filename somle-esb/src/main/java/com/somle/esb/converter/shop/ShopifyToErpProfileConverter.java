package com.somle.esb.converter.shop;

import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.ErpShopSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.module.erp.enums.ErpOffStatus;
import cn.iocoder.yudao.module.erp.enums.ErpShopType;
import com.somle.esb.enums.ESBConstants;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import com.somle.esb.model.ShopProfileDTO;
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


    public ShopifyToErpProfileConverter(ShopProfileType shopProfileType) {
        super(SalesPlatform.SHOPIFY, shopProfileType);
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
                shopDo.setSort(1);
                shopDo.setStatus(ErpOffStatus.OPEN.getCode());
                shopDo.setType(ErpShopType.ONLINE.getCode());
                shopDo.setCountryCode(shopJson.getString(FIELD_COUNTRY));
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
                ErpShopProductDO productDO = new ErpShopProductDO();
                String domain=productJson.getString(FIELD_DOMAIN);
                productDO.setId(null);
                productDO.setName(productJson.getString(FIELD_TITLE));
                productDO.setCode(null);
                productDO.setRemark(null);
                productDO.setPlatformProductUid(productJson.getString(FIELD_ID));
                productDO.setStatus(ErpOffStatus.OPEN.getCode());
                productDO.setShopId(null);
                productDO.setUrl(ESBConstants.PROTOCOL_HTTPS +domain+ SUB_PATH_PRODUCTS +productJson.getString(FIELD_HANDLE));

                JSONObject image=productJson.getJSONObject(FIELD_IMAGE);
                if(image!=null) {
                    productDO.setImage(image.getString(FIELD_SRC));
                }

                productList.add(productDO);
            }

            return productList;
        }

    }


}
