package com.jd.open.api.sdk.domain.hudong.CouponReadOuterService.response.queryCouponPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class MemberCreateModel implements Serializable {
   private Integer userClass;
   private Integer userLevel;
   private String memberClassName;

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

   @JsonProperty("memberClassName")
   public void setMemberClassName(String memberClassName) {
      this.memberClassName = memberClassName;
   }

   @JsonProperty("memberClassName")
   public String getMemberClassName() {
      return this.memberClassName;
   }
}
