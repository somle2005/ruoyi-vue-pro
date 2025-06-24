package com.jd.open.api.sdk.response.jialilue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jialilue.IOpenOrderService.response.syncOrder.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JiliOrderCompleteSyncOrderResponse extends AbstractResponse {
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
