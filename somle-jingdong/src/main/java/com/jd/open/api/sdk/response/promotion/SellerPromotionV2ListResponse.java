package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.JosPromotionReadService.response.list.JosPromotion;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SellerPromotionV2ListResponse extends AbstractResponse {
   private List<JosPromotion> promotionList;

   @JsonProperty("promotion_list")
   public void setPromotionList(List<JosPromotion> promotionList) {
      this.promotionList = promotionList;
   }

   @JsonProperty("promotion_list")
   public List<JosPromotion> getPromotionList() {
      return this.promotionList;
   }
}
