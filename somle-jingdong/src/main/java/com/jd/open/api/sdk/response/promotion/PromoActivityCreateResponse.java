package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.response.create.CreateActivityResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoActivityCreateResponse extends AbstractResponse {
   private CreateActivityResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(CreateActivityResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CreateActivityResponse getReturnType() {
      return this.returnType;
   }
}
