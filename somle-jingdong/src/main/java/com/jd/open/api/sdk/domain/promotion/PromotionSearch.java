package com.jd.open.api.sdk.domain.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PromotionSearch {
   private List<Promotion> promotionList;
   private int promotionTotal;

   @JsonProperty("promotion_list")
   public List<Promotion> getPromotionList() {
      return this.promotionList;
   }

   @JsonProperty("promotion_list")
   public void setPromotionList(List<Promotion> promotionList) {
      this.promotionList = promotionList;
   }

   @JsonProperty("promotion_total")
   public int getPromotionTotal() {
      return this.promotionTotal;
   }

   @JsonProperty("promotion_total")
   public void setPromotionTotal(int promotionTotal) {
      this.promotionTotal = promotionTotal;
   }
}
