package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.BWareSearchService.response.tuopan.SdkPageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2bWareSearchSkulistTuopanResponse extends AbstractResponse {
   private SdkPageResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(SdkPageResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SdkPageResult getReturnType() {
      return this.returnType;
   }
}
