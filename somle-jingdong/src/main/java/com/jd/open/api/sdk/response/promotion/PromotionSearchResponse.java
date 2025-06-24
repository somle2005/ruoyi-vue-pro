package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromotionSearch;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromotionSearchResponse extends AbstractResponse {
   private PromotionSearch promotionSearch;

   @JsonProperty("promotion_search")
   public PromotionSearch getPromotionSearch() {
      return this.promotionSearch;
   }

   @JsonProperty("promotion_search")
   public void setPromotionSearch(PromotionSearch promotionSearch) {
      this.promotionSearch = promotionSearch;
   }
}
