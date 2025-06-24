package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ActivityRuleDTO implements Serializable {
   private PreConditionDTO preConditionDTO;
   private DiscountDTO discountDTO;

   @JsonProperty("preConditionDTO")
   public void setPreConditionDTO(PreConditionDTO preConditionDTO) {
      this.preConditionDTO = preConditionDTO;
   }

   @JsonProperty("preConditionDTO")
   public PreConditionDTO getPreConditionDTO() {
      return this.preConditionDTO;
   }

   @JsonProperty("discountDTO")
   public void setDiscountDTO(DiscountDTO discountDTO) {
      this.discountDTO = discountDTO;
   }

   @JsonProperty("discountDTO")
   public DiscountDTO getDiscountDTO() {
      return this.discountDTO;
   }
}
