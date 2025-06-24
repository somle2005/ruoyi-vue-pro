package com.jd.open.api.sdk.request.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.selfSku.ClientInfo;
import com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.selfSku.UnitSkuQueryInfo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoShopCheckSelfSkuResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoShopCheckSelfSkuRequest extends AbstractRequest implements JdRequest<PromoShopCheckSelfSkuResponse> {
   private ClientInfo clientInfo;
   private UnitSkuQueryInfo unitSkuQueryInfo;

   public String getApiMethod() {
      return "jingdong.promo.shop.check.selfSku";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clientInfo", this.clientInfo);
      pmap.put("unitSkuQueryInfo", this.unitSkuQueryInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoShopCheckSelfSkuResponse> getResponseClass() {
      return PromoShopCheckSelfSkuResponse.class;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("unitSkuQueryInfo")
   public void setUnitSkuQueryInfo(UnitSkuQueryInfo unitSkuQueryInfo) {
      this.unitSkuQueryInfo = unitSkuQueryInfo;
   }

   @JsonProperty("unitSkuQueryInfo")
   public UnitSkuQueryInfo getUnitSkuQueryInfo() {
      return this.unitSkuQueryInfo;
   }
}
