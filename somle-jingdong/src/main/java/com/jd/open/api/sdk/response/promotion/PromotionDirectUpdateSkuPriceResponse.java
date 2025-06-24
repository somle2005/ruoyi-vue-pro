package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.SkuPriceExternalService.response.directUpdateSkuPrice.SkuPriceResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromotionDirectUpdateSkuPriceResponse extends AbstractResponse {
   private SkuPriceResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(SkuPriceResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SkuPriceResult getReturnType() {
      return this.returnType;
   }
}
