package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.count.CountActivitySkuResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoActivitySkuCountResponse extends AbstractResponse {
   private CountActivitySkuResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(CountActivitySkuResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CountActivitySkuResponse getReturnType() {
      return this.returnType;
   }
}
