package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionV2SkuCountResponse extends AbstractResponse {
   private int promotionSkuCount;

   @JsonProperty("promotion_sku_count")
   public void setPromotionSkuCount(int promotionSkuCount) {
      this.promotionSkuCount = promotionSkuCount;
   }

   @JsonProperty("promotion_sku_count")
   public int getPromotionSkuCount() {
      return this.promotionSkuCount;
   }
}
