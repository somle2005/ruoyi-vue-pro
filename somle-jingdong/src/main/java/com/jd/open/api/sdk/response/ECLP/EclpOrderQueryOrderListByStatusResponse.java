package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderListByStatus.OrderQueryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpOrderQueryOrderListByStatusResponse extends AbstractResponse {
   private OrderQueryResult orderQueryResult;

   @JsonProperty("orderQueryResult")
   public void setOrderQueryResult(OrderQueryResult orderQueryResult) {
      this.orderQueryResult = orderQueryResult;
   }

   @JsonProperty("orderQueryResult")
   public OrderQueryResult getOrderQueryResult() {
      return this.orderQueryResult;
   }
}
