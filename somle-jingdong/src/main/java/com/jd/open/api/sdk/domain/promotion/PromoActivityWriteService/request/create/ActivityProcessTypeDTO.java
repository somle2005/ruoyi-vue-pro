package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ActivityProcessTypeDTO implements Serializable {
   private Boolean needManualCheck;

   @JsonProperty("needManualCheck")
   public void setNeedManualCheck(Boolean needManualCheck) {
      this.needManualCheck = needManualCheck;
   }

   @JsonProperty("needManualCheck")
   public Boolean getNeedManualCheck() {
      return this.needManualCheck;
   }
}
