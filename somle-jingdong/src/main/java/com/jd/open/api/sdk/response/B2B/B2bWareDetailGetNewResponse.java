package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.B2BWareQueryProviderNew.response.getNew.SdkResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2bWareDetailGetNewResponse extends AbstractResponse {
   private SdkResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(SdkResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SdkResult getReturnType() {
      return this.returnType;
   }
}
