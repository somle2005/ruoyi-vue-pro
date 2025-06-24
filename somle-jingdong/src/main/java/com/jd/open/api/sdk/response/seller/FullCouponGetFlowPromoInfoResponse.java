package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getFlowPromoInfo.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class FullCouponGetFlowPromoInfoResponse extends AbstractResponse {
   private Result result;

   @JsonProperty("result")
   public void setResult(Result result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Result getResult() {
      return this.result;
   }
}
