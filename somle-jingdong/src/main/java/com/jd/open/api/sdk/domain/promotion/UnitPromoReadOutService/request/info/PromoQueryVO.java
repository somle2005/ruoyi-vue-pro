package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromoQueryVO implements Serializable {
   private String promoId;

   @JsonProperty("promoId")
   public void setPromoId(String promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public String getPromoId() {
      return this.promoId;
   }
}
