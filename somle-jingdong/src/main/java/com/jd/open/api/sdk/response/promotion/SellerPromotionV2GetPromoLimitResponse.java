package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.JosPromotionReadService.response.getPromoLimit.PromoLimit;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionV2GetPromoLimitResponse extends AbstractResponse {
   private PromoLimit josPromoLimit;

   @JsonProperty("jos_promo_limit")
   public void setJosPromoLimit(PromoLimit josPromoLimit) {
      this.josPromoLimit = josPromoLimit;
   }

   @JsonProperty("jos_promo_limit")
   public PromoLimit getJosPromoLimit() {
      return this.josPromoLimit;
   }
}
