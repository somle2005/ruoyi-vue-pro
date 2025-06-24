package com.jd.open.api.sdk.response.udp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.udp.StrategyService.response.byid.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DataVenderStrategyComputeGeneralByidResponse extends AbstractResponse {
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
