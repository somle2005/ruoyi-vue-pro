package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getPromoWares.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class FullCouponGetPromoWaresResponse extends AbstractResponse {
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
