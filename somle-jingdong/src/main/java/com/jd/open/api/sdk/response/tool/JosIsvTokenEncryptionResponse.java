package com.jd.open.api.sdk.response.tool;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.tool.JdTokenService.response.encryption.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JosIsvTokenEncryptionResponse extends AbstractResponse {
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
