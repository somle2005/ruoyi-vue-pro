package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.JhubOrderQueryService.response.querynew.OrderDetailResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SamOrderDetailQuerynewResponse extends AbstractResponse {
   private OrderDetailResult queryorderdetailResult;

   @JsonProperty("queryorderdetail_result")
   public void setQueryorderdetailResult(OrderDetailResult queryorderdetailResult) {
      this.queryorderdetailResult = queryorderdetailResult;
   }

   @JsonProperty("queryorderdetail_result")
   public OrderDetailResult getQueryorderdetailResult() {
      return this.queryorderdetailResult;
   }
}
