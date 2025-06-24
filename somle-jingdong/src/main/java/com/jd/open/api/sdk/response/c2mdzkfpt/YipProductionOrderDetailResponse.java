package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.OrderDetailQueryOpenService.response.orderDetail.OrderDetailResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionOrderDetailResponse extends AbstractResponse {
   private OrderDetailResultEntity result;

   @JsonProperty("result")
   public void setResult(OrderDetailResultEntity result) {
      this.result = result;
   }

   @JsonProperty("result")
   public OrderDetailResultEntity getResult() {
      return this.result;
   }
}
