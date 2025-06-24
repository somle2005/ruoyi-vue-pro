package com.jd.open.api.sdk.response.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.user.UserRelatedRpcI18nService.response.getOpenId.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UserRelatedRpcI18nServiceGetOpenIdResponse extends AbstractResponse {
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
