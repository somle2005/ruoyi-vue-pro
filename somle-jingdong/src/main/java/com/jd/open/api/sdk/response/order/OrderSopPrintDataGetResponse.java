package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderSopPrintData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderSopPrintDataGetResponse extends AbstractResponse {
   private static final long serialVersionUID = -119896893493313580L;
   private OrderSopPrintData apiOrderPrintData;

   @JsonProperty("order_printdata")
   public OrderSopPrintData getApiOrderPrintData() {
      return this.apiOrderPrintData;
   }

   @JsonProperty("order_printdata")
   public void setApiOrderPrintData(OrderSopPrintData apiOrderPrintData) {
      this.apiOrderPrintData = apiOrderPrintData;
   }
}
