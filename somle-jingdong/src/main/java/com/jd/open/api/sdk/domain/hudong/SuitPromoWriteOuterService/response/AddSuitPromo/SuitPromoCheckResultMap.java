package com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.response.AddSuitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SuitPromoCheckResultMap implements Serializable {
   private List<Long> promoIds;

   @JsonProperty("promoIds")
   public void setPromoIds(List<Long> promoIds) {
      this.promoIds = promoIds;
   }

   @JsonProperty("promoIds")
   public List<Long> getPromoIds() {
      return this.promoIds;
   }
}
