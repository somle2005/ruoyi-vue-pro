package com.jd.open.api.sdk.domain.website.response;

import com.jd.open.api.sdk.domain.website.order.OrderCreateResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderCreateResponse extends AbstractResponse {
   private OrderCreateResult orderCreateResult;

   public OrderCreateResult getOrderCreateResult() {
      return this.orderCreateResult;
   }

   public void setOrderCreateResult(OrderCreateResult orderCreateResult) {
      this.orderCreateResult = orderCreateResult;
   }
}
