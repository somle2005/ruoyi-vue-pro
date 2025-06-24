package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionV2CountResponse extends AbstractResponse {
   private int promotionCount;

   @JsonProperty("promotion_count")
   public void setPromotionCount(int promotionCount) {
      this.promotionCount = promotionCount;
   }

   @JsonProperty("promotion_count")
   public int getPromotionCount() {
      return this.promotionCount;
   }
}
