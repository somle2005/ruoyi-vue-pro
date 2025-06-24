package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.response.activity.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoShopDeleteActivityResponse extends AbstractResponse {
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
