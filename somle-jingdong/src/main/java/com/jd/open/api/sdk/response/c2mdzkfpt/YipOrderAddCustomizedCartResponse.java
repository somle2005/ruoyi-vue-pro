package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.CartForThirdPartyCustomService.response.addCustomizedCart.CartDataResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipOrderAddCustomizedCartResponse extends AbstractResponse {
   private CartDataResult result;

   @JsonProperty("result")
   public void setResult(CartDataResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public CartDataResult getResult() {
      return this.result;
   }
}
