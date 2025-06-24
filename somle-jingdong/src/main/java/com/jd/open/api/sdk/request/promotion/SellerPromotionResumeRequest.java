package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionResumeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionResumeRequest extends AbstractRequest implements JdRequest<SellerPromotionResumeResponse> {
   private Long promoId;

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.resume";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("promo_id", this.promoId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionResumeResponse> getResponseClass() {
      return SellerPromotionResumeResponse.class;
   }
}
