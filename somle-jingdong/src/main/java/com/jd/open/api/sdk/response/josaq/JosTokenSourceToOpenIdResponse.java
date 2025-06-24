package com.jd.open.api.sdk.response.josaq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.josaq.TokenToPinJosCenter.response.openId.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JosTokenSourceToOpenIdResponse extends AbstractResponse {
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
