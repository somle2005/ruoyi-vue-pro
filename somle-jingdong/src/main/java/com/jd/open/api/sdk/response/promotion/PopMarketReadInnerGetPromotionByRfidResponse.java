package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromotionReadInnerService.response.getPromotionByRfid.Promotion;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopMarketReadInnerGetPromotionByRfidResponse extends AbstractResponse {
   private Promotion promotion;

   @JsonProperty("promotion")
   public void setPromotion(Promotion promotion) {
      this.promotion = promotion;
   }

   @JsonProperty("promotion")
   public Promotion getPromotion() {
      return this.promotion;
   }
}
