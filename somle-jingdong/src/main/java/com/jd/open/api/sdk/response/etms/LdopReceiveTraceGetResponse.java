package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.TraceQueryJsf.response.get.TraceQueryResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopReceiveTraceGetResponse extends AbstractResponse {
   private TraceQueryResultDTO querytraceResult;

   @JsonProperty("querytrace_result")
   public void setQuerytraceResult(TraceQueryResultDTO querytraceResult) {
      this.querytraceResult = querytraceResult;
   }

   @JsonProperty("querytrace_result")
   public TraceQueryResultDTO getQuerytraceResult() {
      return this.querytraceResult;
   }
}
