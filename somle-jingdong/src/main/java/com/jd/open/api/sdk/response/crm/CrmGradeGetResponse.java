package com.jd.open.api.sdk.response.crm;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.crm.GradePromotionService.response.get.GradePromotion;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CrmGradeGetResponse extends AbstractResponse {
   private GradePromotion[] gradePromotions;

   @JsonProperty("grade_promotions")
   public void setGradePromotions(GradePromotion[] gradePromotions) {
      this.gradePromotions = gradePromotions;
   }

   @JsonProperty("grade_promotions")
   public GradePromotion[] getGradePromotions() {
      return this.gradePromotions;
   }
}
