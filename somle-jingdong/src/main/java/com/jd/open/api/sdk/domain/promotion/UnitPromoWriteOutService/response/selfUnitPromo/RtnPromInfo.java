package com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.response.selfUnitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RtnPromInfo implements Serializable {
   private Long promoId;

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }
}
