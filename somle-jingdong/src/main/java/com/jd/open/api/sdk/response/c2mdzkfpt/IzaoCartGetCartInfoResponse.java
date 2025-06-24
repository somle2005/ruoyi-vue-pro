package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.CartForThirdPartyCustomService.response.getCartInfo.ThirdPartyCartDataResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class IzaoCartGetCartInfoResponse extends AbstractResponse {
   private ThirdPartyCartDataResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(ThirdPartyCartDataResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ThirdPartyCartDataResult getReturnType() {
      return this.returnType;
   }
}
