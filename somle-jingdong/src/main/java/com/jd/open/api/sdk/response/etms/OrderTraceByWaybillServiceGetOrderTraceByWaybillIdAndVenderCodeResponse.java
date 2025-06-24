package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.OrderTraceByWaybillService.response.getOrderTraceByWaybillIdAndVenderCode.StandardListResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderTraceByWaybillServiceGetOrderTraceByWaybillIdAndVenderCodeResponse extends AbstractResponse {
   private StandardListResponse response;

   @JsonProperty("response")
   public void setResponse(StandardListResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public StandardListResponse getResponse() {
      return this.response;
   }
}
