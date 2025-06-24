package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.response.commit.CommonResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoActivityCommitResponse extends AbstractResponse {
   private CommonResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(CommonResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CommonResponse getReturnType() {
      return this.returnType;
   }
}
