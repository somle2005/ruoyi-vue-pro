package com.jd.open.api.sdk.response.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.user.FollowVenderReadRpcService.response.queryForCountByVid.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class FollowVenderReadQueryForCountByVidResponse extends AbstractResponse {
   private Result queryforcountbyvidResult;

   @JsonProperty("queryforcountbyvid_result")
   public void setQueryforcountbyvidResult(Result queryforcountbyvidResult) {
      this.queryforcountbyvidResult = queryforcountbyvidResult;
   }

   @JsonProperty("queryforcountbyvid_result")
   public Result getQueryforcountbyvidResult() {
      return this.queryforcountbyvidResult;
   }
}
