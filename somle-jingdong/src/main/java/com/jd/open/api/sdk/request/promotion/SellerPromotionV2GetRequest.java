package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionV2GetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionV2GetRequest extends AbstractRequest implements JdRequest<SellerPromotionV2GetResponse> {
   private String ip;
   private String port;
   private Long promoId;
   private Integer promoType;

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public void setPromoType(Integer promoType) {
      this.promoType = promoType;
   }

   public Integer getPromoType() {
      return this.promoType;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.v2.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("promo_id", this.promoId);
      pmap.put("promo_type", this.promoType);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionV2GetResponse> getResponseClass() {
      return SellerPromotionV2GetResponse.class;
   }
}
