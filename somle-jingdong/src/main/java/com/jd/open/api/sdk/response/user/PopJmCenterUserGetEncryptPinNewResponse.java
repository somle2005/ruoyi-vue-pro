package com.jd.open.api.sdk.response.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.user.TokenToPinJosCenter.response.getEncryptPinNew.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopJmCenterUserGetEncryptPinNewResponse extends AbstractResponse {
   private Result returnType;

   @JsonProperty("returnType")
   public void setReturnType(Result returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Result getReturnType() {
      return this.returnType;
   }
}
