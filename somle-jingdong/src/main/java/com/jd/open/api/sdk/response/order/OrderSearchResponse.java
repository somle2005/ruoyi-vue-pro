package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderSearchResponse extends AbstractResponse {
   private static final long serialVersionUID = 1081272260590580L;
   private OrderResult orderResult;

   @JsonProperty("order_search")
   public OrderResult getOrderInfoResult() {
      return this.orderResult;
   }

   @JsonProperty("order_search")
   public void setOrderInfoResult(OrderResult orderResult) {
      this.orderResult = orderResult;
   }
}
