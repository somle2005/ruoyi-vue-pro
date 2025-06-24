package com.jd.open.api.sdk.response.yunjiaoyi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yunjiaoyi.BuyoutTradeService.response.getJDDistrict.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OpenCloudtradeTradeGetJDDistrictResponse extends AbstractResponse {
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
