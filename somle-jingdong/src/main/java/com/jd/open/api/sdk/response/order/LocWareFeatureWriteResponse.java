package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.LocOrderCodeSoaService.response.write.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LocWareFeatureWriteResponse extends AbstractResponse {
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
