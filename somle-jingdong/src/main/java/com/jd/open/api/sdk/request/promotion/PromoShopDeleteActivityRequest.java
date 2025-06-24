package com.jd.open.api.sdk.request.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.request.activity.ClientInfo;
import com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.request.activity.UnitDeletePromInfo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoShopDeleteActivityResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoShopDeleteActivityRequest extends AbstractRequest implements JdRequest<PromoShopDeleteActivityResponse> {
   private UnitDeletePromInfo unitDeletePromInfo;
   private ClientInfo clientInfo;

   public String getApiMethod() {
      return "jingdong.promo.shop.delete.activity";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("unitDeletePromInfo", this.unitDeletePromInfo);
      pmap.put("clientInfo", this.clientInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoShopDeleteActivityResponse> getResponseClass() {
      return PromoShopDeleteActivityResponse.class;
   }

   @JsonProperty("unitDeletePromInfo")
   public void setUnitDeletePromInfo(UnitDeletePromInfo unitDeletePromInfo) {
      this.unitDeletePromInfo = unitDeletePromInfo;
   }

   @JsonProperty("unitDeletePromInfo")
   public UnitDeletePromInfo getUnitDeletePromInfo() {
      return this.unitDeletePromInfo;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }
}
