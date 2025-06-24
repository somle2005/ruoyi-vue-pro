package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.TraceDynamicQueryService.response.queryDynamicTraceInfo.TraceQueryResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class TraceDynamicQueryServiceQueryDynamicTraceInfoResponse extends AbstractResponse {
   private TraceQueryResponse response;

   @JsonProperty("response")
   public void setResponse(TraceQueryResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public TraceQueryResponse getResponse() {
      return this.response;
   }
}
