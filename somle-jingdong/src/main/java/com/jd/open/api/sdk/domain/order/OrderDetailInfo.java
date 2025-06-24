package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFilter("OrderDetailInfo")
public class OrderDetailInfo {
   private OrderInfo orderInfo;

   @JsonProperty("orderInfo")
   public OrderInfo getOrderInfo() {
      return this.orderInfo;
   }

   @JsonProperty("orderInfo")
   public void setOrderInfo(OrderInfo orderInfo) {
      this.orderInfo = orderInfo;
   }
}
