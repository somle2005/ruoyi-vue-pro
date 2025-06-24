package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.UnitPromotionReadService.response.getPromotionList.Promotion;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class PopMarketRetrievePromotionGetPromotionListResponse extends AbstractResponse {
   private List<Promotion> promotionList;

   @JsonProperty("promotionList")
   public void setPromotionList(List<Promotion> promotionList) {
      this.promotionList = promotionList;
   }

   @JsonProperty("promotionList")
   public List<Promotion> getPromotionList() {
      return this.promotionList;
   }
}
