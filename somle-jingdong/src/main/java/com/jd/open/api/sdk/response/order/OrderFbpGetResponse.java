package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderDetailInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderFbpGetResponse extends AbstractResponse {
   private OrderDetailInfo orderDetailInfo;

   @JsonProperty("order")
   public OrderDetailInfo getOrderDetailInfo() {
      return this.orderDetailInfo;
   }

   @JsonProperty("order")
   public void setOrderDetailInfo(OrderDetailInfo orderDetailInfo) {
      this.orderDetailInfo = orderDetailInfo;
   }
}
