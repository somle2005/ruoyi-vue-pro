package com.jd.open.api.sdk.request.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.info.ClientInfo;
import com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.info.PromoQueryVO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoShopActivityInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoShopActivityInfoRequest extends AbstractRequest implements JdRequest<PromoShopActivityInfoResponse> {
   private ClientInfo clientInfo;
   private PromoQueryVO promoQueryVO;

   public String getApiMethod() {
      return "jingdong.promo.shop.activity.info";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clientInfo", this.clientInfo);
      pmap.put("promoQueryVO", this.promoQueryVO);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoShopActivityInfoResponse> getResponseClass() {
      return PromoShopActivityInfoResponse.class;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("promoQueryVO")
   public void setPromoQueryVO(PromoQueryVO promoQueryVO) {
      this.promoQueryVO = promoQueryVO;
   }

   @JsonProperty("promoQueryVO")
   public PromoQueryVO getPromoQueryVO() {
      return this.promoQueryVO;
   }
}
