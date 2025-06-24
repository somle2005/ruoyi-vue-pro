package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderSoplPrintData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderSoplPrintDataGetResponse extends AbstractResponse {
   private static final long serialVersionUID = 1555542396428069847L;
   private OrderSoplPrintData apiOrderPrintData;

   @JsonProperty("order_printdata")
   public OrderSoplPrintData getApiOrderPrintData() {
      return this.apiOrderPrintData;
   }

   @JsonProperty("order_printdata")
   public void setApiOrderPrintData(OrderSoplPrintData apiOrderPrintData) {
      this.apiOrderPrintData = apiOrderPrintData;
   }
}
