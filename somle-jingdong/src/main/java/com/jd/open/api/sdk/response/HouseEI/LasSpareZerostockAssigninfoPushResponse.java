package com.jd.open.api.sdk.response.HouseEI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.HouseEI.ZeroStockJosExternalJSFService.response.push.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LasSpareZerostockAssigninfoPushResponse extends AbstractResponse {
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
