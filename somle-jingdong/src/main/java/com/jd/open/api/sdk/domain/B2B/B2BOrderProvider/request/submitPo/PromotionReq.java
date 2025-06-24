package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromotionReq implements Serializable {
   private Long promotionId;
   private Integer promotionType;

   @JsonProperty("promotionId")
   public void setPromotionId(Long promotionId) {
      this.promotionId = promotionId;
   }

   @JsonProperty("promotionId")
   public Long getPromotionId() {
      return this.promotionId;
   }

   @JsonProperty("promotionType")
   public void setPromotionType(Integer promotionType) {
      this.promotionType = promotionType;
   }

   @JsonProperty("promotionType")
   public Integer getPromotionType() {
      return this.promotionType;
   }
}
