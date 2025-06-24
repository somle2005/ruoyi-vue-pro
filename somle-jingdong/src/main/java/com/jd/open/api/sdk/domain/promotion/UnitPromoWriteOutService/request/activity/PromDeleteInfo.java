package com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.request.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromDeleteInfo implements Serializable {
   private Integer promoType;
   private Long promoId;

   @JsonProperty("promoType")
   public void setPromoType(Integer promoType) {
      this.promoType = promoType;
   }

   @JsonProperty("promoType")
   public Integer getPromoType() {
      return this.promoType;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }
}
