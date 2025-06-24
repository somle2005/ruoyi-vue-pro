package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionGetResponse extends AbstractResponse {
   private PromotionVO promotionVO;

   @JsonProperty("promotion_v_o")
   public void setPromotionVO(PromotionVO promotionVO) {
      this.promotionVO = promotionVO;
   }

   @JsonProperty("promotion_v_o")
   public PromotionVO getPromotionVO() {
      return this.promotionVO;
   }
}
