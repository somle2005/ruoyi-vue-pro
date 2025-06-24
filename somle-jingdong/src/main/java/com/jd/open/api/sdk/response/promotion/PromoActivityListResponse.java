package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.list.ListActivityDtoResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoActivityListResponse extends AbstractResponse {
   private ListActivityDtoResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(ListActivityDtoResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ListActivityDtoResponse getReturnType() {
      return this.returnType;
   }
}
