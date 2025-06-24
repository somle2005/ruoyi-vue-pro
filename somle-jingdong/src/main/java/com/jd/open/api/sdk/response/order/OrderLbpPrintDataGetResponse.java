package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderLbpPrintData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderLbpPrintDataGetResponse extends AbstractResponse {
   private static final long serialVersionUID = 4423411785700449965L;
   private OrderLbpPrintData apiOrderPrintData;

   @JsonProperty("order_printdata")
   public OrderLbpPrintData getApiOrderPrintData() {
      return this.apiOrderPrintData;
   }

   @JsonProperty("order_printdata")
   public void setApiOrderPrintData(OrderLbpPrintData apiOrderPrintData) {
      this.apiOrderPrintData = apiOrderPrintData;
   }
}
