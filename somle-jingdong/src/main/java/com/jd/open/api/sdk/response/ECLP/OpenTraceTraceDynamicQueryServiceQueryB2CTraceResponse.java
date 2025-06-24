package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.TraceDynamicQueryService.response.queryB2CTrace.TraceQueryResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OpenTraceTraceDynamicQueryServiceQueryB2CTraceResponse extends AbstractResponse {
   private TraceQueryResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(TraceQueryResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public TraceQueryResponse getReturnType() {
      return this.returnType;
   }
}
