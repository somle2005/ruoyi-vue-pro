package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareShopOhsDsmApiFacadeSaleattrSaleAttributeServiceGetSaleAttUpAuthResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareShopOhsDsmApiFacadeSaleattrSaleAttributeServiceGetSaleAttUpAuthRequest extends AbstractRequest implements JdRequest<WareShopOhsDsmApiFacadeSaleattrSaleAttributeServiceGetSaleAttUpAuthResponse> {
   public String getApiMethod() {
      return "jingdong.ware.shop.ohs.dsm.api.facade.saleattr.SaleAttributeService.getSaleAttUpAuth";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<WareShopOhsDsmApiFacadeSaleattrSaleAttributeServiceGetSaleAttUpAuthResponse> getResponseClass() {
      return WareShopOhsDsmApiFacadeSaleattrSaleAttributeServiceGetSaleAttUpAuthResponse.class;
   }
}
