package com.jd.open.api.sdk.domain.etms.OrderTraceByWaybillService.response.getOrderTraceByWaybillIdAndVenderCode;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StandardListResponse implements Serializable {
   private int resultCode;
   private String resultMsg;
   private OrderTrace results;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("results")
   public void setResults(OrderTrace results) {
      this.results = results;
   }

   @JsonProperty("results")
   public OrderTrace getResults() {
      return this.results;
   }
}
