package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.enGet.OrderResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderEnGetResponse extends AbstractResponse {
   private OrderResult orderDetailInfo;

   @JsonProperty("orderDetailInfo")
   public void setOrderDetailInfo(OrderResult orderDetailInfo) {
      this.orderDetailInfo = orderDetailInfo;
   }

   @JsonProperty("orderDetailInfo")
   public OrderResult getOrderDetailInfo() {
      return this.orderDetailInfo;
   }
}
