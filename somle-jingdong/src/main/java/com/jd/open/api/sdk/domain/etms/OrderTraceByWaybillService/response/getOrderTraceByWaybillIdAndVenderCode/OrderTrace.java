package com.jd.open.api.sdk.domain.etms.OrderTraceByWaybillService.response.getOrderTraceByWaybillIdAndVenderCode;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderTrace implements Serializable {
   private List<TraceDetail> traceDetails;

   @JsonProperty("traceDetails")
   public void setTraceDetails(List<TraceDetail> traceDetails) {
      this.traceDetails = traceDetails;
   }

   @JsonProperty("traceDetails")
   public List<TraceDetail> getTraceDetails() {
      return this.traceDetails;
   }
}
