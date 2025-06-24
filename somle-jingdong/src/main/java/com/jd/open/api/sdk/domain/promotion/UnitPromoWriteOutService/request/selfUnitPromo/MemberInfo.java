package com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.request.selfUnitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class MemberInfo implements Serializable {
   private Integer userClass;

   @JsonProperty("userClass")
   public void setUserClass(Integer userClass) {
      this.userClass = userClass;
   }

   @JsonProperty("userClass")
   public Integer getUserClass() {
      return this.userClass;
   }
}
