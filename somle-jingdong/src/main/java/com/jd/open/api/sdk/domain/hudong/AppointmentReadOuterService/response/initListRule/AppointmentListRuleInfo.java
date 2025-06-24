package com.jd.open.api.sdk.domain.hudong.AppointmentReadOuterService.response.initListRule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AppointmentListRuleInfo implements Serializable {
   private Boolean auth;

   @JsonProperty("auth")
   public void setAuth(Boolean auth) {
      this.auth = auth;
   }

   @JsonProperty("auth")
   public Boolean getAuth() {
      return this.auth;
   }
}
