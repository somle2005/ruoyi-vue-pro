package com.jd.open.api.sdk.response.josaq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.josaq.XIdService.response.batchPin2Xid.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JosOauthRpcXidBatchPin2XidResponse extends AbstractResponse {
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
