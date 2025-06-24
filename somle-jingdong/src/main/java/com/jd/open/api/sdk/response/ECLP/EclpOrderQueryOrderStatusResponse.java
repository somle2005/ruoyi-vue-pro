package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderStatus.OrderDefaultResultStatus;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpOrderQueryOrderStatusResponse extends AbstractResponse {
   private OrderDefaultResultStatus queryorderstatusResult;

   @JsonProperty("queryorderstatus_result")
   public void setQueryorderstatusResult(OrderDefaultResultStatus queryorderstatusResult) {
      this.queryorderstatusResult = queryorderstatusResult;
   }

   @JsonProperty("queryorderstatus_result")
   public OrderDefaultResultStatus getQueryorderstatusResult() {
      return this.queryorderstatusResult;
   }
}
