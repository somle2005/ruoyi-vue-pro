package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.get.GetActivityResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoActivityDetailGetResponse extends AbstractResponse {
   private GetActivityResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(GetActivityResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public GetActivityResponse getReturnType() {
      return this.returnType;
   }
}
