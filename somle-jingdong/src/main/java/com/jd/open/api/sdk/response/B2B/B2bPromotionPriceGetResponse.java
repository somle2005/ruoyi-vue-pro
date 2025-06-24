package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.B2BPromotionProvider.response.get.PriceResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2bPromotionPriceGetResponse extends AbstractResponse {
   private PriceResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(PriceResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public PriceResult getReturnType() {
      return this.returnType;
   }
}
