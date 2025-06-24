package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpTraceServiceJosOrderTraceByWaybillServiceResponse extends AbstractResponse {
   private String getordertracebywaybillidResult;

   @JsonProperty("getordertracebywaybillid_result")
   public void setGetordertracebywaybillidResult(String getordertracebywaybillidResult) {
      this.getordertracebywaybillidResult = getordertracebywaybillidResult;
   }

   @JsonProperty("getordertracebywaybillid_result")
   public String getGetordertracebywaybillidResult() {
      return this.getordertracebywaybillidResult;
   }
}
