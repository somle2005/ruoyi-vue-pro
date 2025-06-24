package com.jd.open.api.sdk.domain.supplier.ReturnExecuteOrderHandlerJosApi.request.callWaybillByVc;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReturnExecuteOrderCallLogisticsDto implements Serializable {
   private String requestId;
   private String returnExecutionOrderId;

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("returnExecutionOrderId")
   public void setReturnExecutionOrderId(String returnExecutionOrderId) {
      this.returnExecutionOrderId = returnExecutionOrderId;
   }

   @JsonProperty("returnExecutionOrderId")
   public String getReturnExecutionOrderId() {
      return this.returnExecutionOrderId;
   }
}
