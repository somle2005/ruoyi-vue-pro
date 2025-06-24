package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderOrderDeleteApplyResponse extends AbstractResponse {
   private ApiJosResult result;

   @JsonProperty("result")
   public void setResult(ApiJosResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ApiJosResult getResult() {
      return this.result;
   }
}
