package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.CartForThirdPartyCustomService.response.addCartForeignGold.ThirdPartyCartDataResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipOrderAddCartForeignGoldResponse extends AbstractResponse {
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
