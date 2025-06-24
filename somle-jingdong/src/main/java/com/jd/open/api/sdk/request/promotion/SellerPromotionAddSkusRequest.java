package com.jd.open.api.sdk.request.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.UnitPromotionWriteService.request.addSkus.ClientInfo;
import com.jd.open.api.sdk.domain.promotion.UnitPromotionWriteService.request.addSkus.PromotionSku;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionAddSkusResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionAddSkusRequest extends AbstractRequest implements JdRequest<SellerPromotionAddSkusResponse> {
   private ClientInfo clientInfo;
   private Long promoId;
   private List<PromotionSku> promotionSkus;

   public String getApiMethod() {
      return "jingdong.seller.promotion.addSkus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("client_info", this.clientInfo);
      pmap.put("promoId", this.promoId);
      pmap.put("promotionSkus", this.promotionSkus);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionAddSkusResponse> getResponseClass() {
      return SellerPromotionAddSkusResponse.class;
   }

   @JsonProperty("client_info")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("client_info")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("promotionSkus")
   public void setPromotionSkus(List<PromotionSku> promotionSkus) {
      this.promotionSkus = promotionSkus;
   }

   @JsonProperty("promotionSkus")
   public List<PromotionSku> getPromotionSkus() {
      return this.promotionSkus;
   }
}
