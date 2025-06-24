package com.jd.open.api.sdk.domain.hudong.PresaleQueryService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class MemberCreateModel implements Serializable {
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
