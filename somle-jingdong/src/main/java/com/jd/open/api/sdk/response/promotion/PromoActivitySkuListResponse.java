package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.list.ListActivitySkuResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoActivitySkuListResponse extends AbstractResponse {
   private ListActivitySkuResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(ListActivitySkuResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ListActivitySkuResponse getReturnType() {
      return this.returnType;
   }
}
