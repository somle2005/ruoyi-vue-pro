package com.jd.open.api.sdk.request.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.VenderBusinessIdFacade.request.getVenderBusinessByVenderId.I18nParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.ShopBusinessidGetVenderBusinessByVenderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ShopBusinessidGetVenderBusinessByVenderIdRequest extends AbstractRequest implements JdRequest<ShopBusinessidGetVenderBusinessByVenderIdResponse> {
   private I18nParam i18nParam;

   public String getApiMethod() {
      return "jingdong.shop.businessid.getVenderBusinessByVenderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("i18nParam", this.i18nParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<ShopBusinessidGetVenderBusinessByVenderIdResponse> getResponseClass() {
      return ShopBusinessidGetVenderBusinessByVenderIdResponse.class;
   }

   @JsonProperty("i18nParam")
   public void setI18nParam(I18nParam i18nParam) {
      this.i18nParam = i18nParam;
   }

   @JsonProperty("i18nParam")
   public I18nParam getI18nParam() {
      return this.i18nParam;
   }
}
