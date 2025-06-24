package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderPrintData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderPrintDataGetResponse extends AbstractResponse {
   private OrderPrintData apiOrderPrintData;

   @JsonProperty("order_printdata")
   public OrderPrintData getApiOrderPrintData() {
      return this.apiOrderPrintData;
   }

   @JsonProperty("order_printdata")
   public void setApiOrderPrintData(OrderPrintData apiOrderPrintData) {
      this.apiOrderPrintData = apiOrderPrintData;
   }
}
