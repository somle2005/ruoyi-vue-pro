package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.response.getSuitPromoDtail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class MemberDetailVo implements Serializable {
   private String memberName;
   private Integer userLevel;

   @JsonProperty("memberName")
   public void setMemberName(String memberName) {
      this.memberName = memberName;
   }

   @JsonProperty("memberName")
   public String getMemberName() {
      return this.memberName;
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
