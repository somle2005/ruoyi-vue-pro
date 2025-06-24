package com.jd.open.api.sdk.domain.hudong.CouponOuterWriteService.request.createCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class MemberOuterParam implements Serializable {
   private Integer userClass;
   private Integer userLevel;

   @JsonProperty("userClass")
   public void setUserClass(Integer userClass) {
      this.userClass = userClass;
   }

   @JsonProperty("userClass")
   public Integer getUserClass() {
      return this.userClass;
   }

   @JsonProperty("userLevel")
   public void setUserLevel(Integer userLevel) {
      this.userLevel = userLevel;
   }

   @JsonProperty("userLevel")
   public Integer getUserLevel() {
      return this.userLevel;
   }
}
