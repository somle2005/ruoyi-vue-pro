package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpTraceServiceJosOrderTraceByOrderServiceResponse extends AbstractResponse {
   private String getordertracebyorderidResult;

   @JsonProperty("getordertracebyorderid_result")
   public void setGetordertracebyorderidResult(String getordertracebyorderidResult) {
      this.getordertracebyorderidResult = getordertracebyorderidResult;
   }

   @JsonProperty("getordertracebyorderid_result")
   public String getGetordertracebyorderidResult() {
      return this.getordertracebyorderidResult;
   }
}
