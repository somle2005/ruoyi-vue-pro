package com.jd.open.api.sdk.request.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.request.selfUnitPromo.ClientInfo;
import com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.request.selfUnitPromo.UnitPromInfo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoShopCreateSelfUnitPromoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoShopCreateSelfUnitPromoRequest extends AbstractRequest implements JdRequest<PromoShopCreateSelfUnitPromoResponse> {
   private ClientInfo clientInfo;
   private UnitPromInfo unitPromoInfo;

   public String getApiMethod() {
      return "jingdong.promo.shop.create.selfUnitPromo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clientInfo", this.clientInfo);
      pmap.put("unitPromoInfo", this.unitPromoInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoShopCreateSelfUnitPromoResponse> getResponseClass() {
      return PromoShopCreateSelfUnitPromoResponse.class;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("unitPromoInfo")
   public void setUnitPromoInfo(UnitPromInfo unitPromoInfo) {
      this.unitPromoInfo = unitPromoInfo;
   }

   @JsonProperty("unitPromoInfo")
   public UnitPromInfo getUnitPromoInfo() {
      return this.unitPromoInfo;
   }
}
