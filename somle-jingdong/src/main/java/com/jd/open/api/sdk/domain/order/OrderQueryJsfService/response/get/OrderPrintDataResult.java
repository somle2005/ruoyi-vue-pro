package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderPrintDataResult implements Serializable {
   private ApiOrderPrintData apiOrderPrintResult;

   @JsonProperty("api_order_print_result")
   public void setApiOrderPrintResult(ApiOrderPrintData apiOrderPrintResult) {
      this.apiOrderPrintResult = apiOrderPrintResult;
   }

   @JsonProperty("api_order_print_result")
   public ApiOrderPrintData getApiOrderPrintResult() {
      return this.apiOrderPrintResult;
   }
}
