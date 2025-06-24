package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.VenderBusinessIdFacade.response.getVenderBusinessByVenderId.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ShopBusinessidGetVenderBusinessByVenderIdResponse extends AbstractResponse {
   private Result result;

   @JsonProperty("result")
   public void setResult(Result result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Result getResult() {
      return this.result;
   }
}
