package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpTraceServiceJosSubscribeTraceByWaybillServiceResponse extends AbstractResponse {
   private String subscribetracebywaybillResult;

   @JsonProperty("subscribetracebywaybill_result")
   public void setSubscribetracebywaybillResult(String subscribetracebywaybillResult) {
      this.subscribetracebywaybillResult = subscribetracebywaybillResult;
   }

   @JsonProperty("subscribetracebywaybill_result")
   public String getSubscribetracebywaybillResult() {
      return this.subscribetracebywaybillResult;
   }
}
