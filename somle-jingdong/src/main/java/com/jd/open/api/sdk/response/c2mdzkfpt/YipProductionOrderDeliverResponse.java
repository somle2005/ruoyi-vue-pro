package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.OrderDeliverOpenService.response.orderDeliver.DeliverResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionOrderDeliverResponse extends AbstractResponse {
   private DeliverResultEntity returnType;

   @JsonProperty("returnType")
   public void setReturnType(DeliverResultEntity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public DeliverResultEntity getReturnType() {
      return this.returnType;
   }
}
