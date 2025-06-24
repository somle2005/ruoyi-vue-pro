package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.SuitPromoInitOuterService.response.SuitPromoInitOuterService.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ComJdMarketToolPromoApiSuitServiceSuitPromoInitOuterServiceResponse extends AbstractResponse {
   private Result returnType;

   @JsonProperty("returnType")
   public void setReturnType(Result returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Result getReturnType() {
      return this.returnType;
   }
}
