package com.jd.open.api.sdk.response.aqyzzx;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.aqyzzx.SafeAuthenticationService.response.eliminateRisk.SafeCResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MfaInnerEliminateRiskResponse extends AbstractResponse {
   private SafeCResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(SafeCResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SafeCResult getReturnType() {
      return this.returnType;
   }
}
