package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ArrayList implements Serializable {
   private OrderResp orderResp;

   @JsonProperty("orderResp")
   public void setOrderResp(OrderResp orderResp) {
      this.orderResp = orderResp;
   }

   @JsonProperty("orderResp")
   public OrderResp getOrderResp() {
      return this.orderResp;
   }
}
