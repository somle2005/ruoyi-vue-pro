package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder.OrderDetailResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpOrderQueryOrderResponse extends AbstractResponse {
   private OrderDetailResult queryorderResult;

   @JsonProperty("queryorder_result")
   public void setQueryorderResult(OrderDetailResult queryorderResult) {
      this.queryorderResult = queryorderResult;
   }

   @JsonProperty("queryorder_result")
   public OrderDetailResult getQueryorderResult() {
      return this.queryorderResult;
   }
}
