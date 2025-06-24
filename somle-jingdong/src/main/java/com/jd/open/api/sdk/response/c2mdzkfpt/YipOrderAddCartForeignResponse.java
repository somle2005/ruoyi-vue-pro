package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.CartForThirdPartyCustomService.response.addCartForeign.ThirdPartyCartDataResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipOrderAddCartForeignResponse extends AbstractResponse {
   private ThirdPartyCartDataResult result;

   @JsonProperty("result")
   public void setResult(ThirdPartyCartDataResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ThirdPartyCartDataResult getResult() {
      return this.result;
   }
}
