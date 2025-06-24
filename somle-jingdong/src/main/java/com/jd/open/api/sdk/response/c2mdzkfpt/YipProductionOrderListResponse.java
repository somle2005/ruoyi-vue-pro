package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.OrderListQueryOpenService.response.orderList.OrderListResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionOrderListResponse extends AbstractResponse {
   private OrderListResultEntity result;

   @JsonProperty("result")
   public void setResult(OrderListResultEntity result) {
      this.result = result;
   }

   @JsonProperty("result")
   public OrderListResultEntity getResult() {
      return this.result;
   }
}
