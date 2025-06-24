package com.jd.open.api.sdk.response.O2O;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.O2O.LocOrderCodeSoaService.response.consume.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LocCodeConsumeResponse extends AbstractResponse {
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
