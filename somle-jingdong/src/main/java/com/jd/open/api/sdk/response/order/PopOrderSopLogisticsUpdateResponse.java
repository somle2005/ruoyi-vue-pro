package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.IGlobalOrderProduceServiceForJos.response.update.ApiSafResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderSopLogisticsUpdateResponse extends AbstractResponse {
   private ApiSafResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(ApiSafResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ApiSafResult getReturnType() {
      return this.returnType;
   }
}
