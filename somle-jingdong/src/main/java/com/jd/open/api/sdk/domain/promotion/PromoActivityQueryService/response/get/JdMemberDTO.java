package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JdMemberDTO implements Serializable {
   private Integer memberLevel;
   private Boolean memberOnly;

   @JsonProperty("memberLevel")
   public void setMemberLevel(Integer memberLevel) {
      this.memberLevel = memberLevel;
   }

   @JsonProperty("memberLevel")
   public Integer getMemberLevel() {
      return this.memberLevel;
   }

   @JsonProperty("memberOnly")
   public void setMemberOnly(Boolean memberOnly) {
      this.memberOnly = memberOnly;
   }

   @JsonProperty("memberOnly")
   public Boolean getMemberOnly() {
      return this.memberOnly;
   }
}
