package com.jd.open.api.sdk.response.jlapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jlapi.UserReadExtProvider.response.queryByMobile.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JlMemberUserextQueryByMobileResponse extends AbstractResponse {
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
