package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionAddResponse extends AbstractResponse {
   private Long promoId;

   @JsonProperty("promo_id")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promo_id")
   public Long getPromoId() {
      return this.promoId;
   }
}
