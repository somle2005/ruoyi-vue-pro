package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.JosPromotionReadService.response.get.JosPromotion;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionV2GetResponse extends AbstractResponse {
   private JosPromotion josPromotion;

   @JsonProperty("jos_promotion")
   public void setJosPromotion(JosPromotion josPromotion) {
      this.josPromotion = josPromotion;
   }

   @JsonProperty("jos_promotion")
   public JosPromotion getJosPromotion() {
      return this.josPromotion;
   }
}
