package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderNotPayService.response.notPayOrderById.OrderDataNotPayInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderNotPayOrderByIdResponse extends AbstractResponse {
   private OrderDataNotPayInfo orderDataNotPayInfo;

   @JsonProperty("orderDataNotPayInfo")
   public void setOrderDataNotPayInfo(OrderDataNotPayInfo orderDataNotPayInfo) {
      this.orderDataNotPayInfo = orderDataNotPayInfo;
   }

   @JsonProperty("orderDataNotPayInfo")
   public OrderDataNotPayInfo getOrderDataNotPayInfo() {
      return this.orderDataNotPayInfo;
   }
}
