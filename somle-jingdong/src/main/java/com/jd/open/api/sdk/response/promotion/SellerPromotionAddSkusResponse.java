package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.UnitPromotionWriteService.response.addSkus.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionAddSkusResponse extends AbstractResponse {
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
