package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpTraceServiceJosSubscribeWaybillTraceServiceResponse extends AbstractResponse {
   private String gettracebysubscribewaybillResult;

   @JsonProperty("gettracebysubscribewaybill_result")
   public void setGettracebysubscribewaybillResult(String gettracebysubscribewaybillResult) {
      this.gettracebysubscribewaybillResult = gettracebysubscribewaybillResult;
   }

   @JsonProperty("gettracebysubscribewaybill_result")
   public String getGettracebysubscribewaybillResult() {
      return this.gettracebysubscribewaybillResult;
   }
}
