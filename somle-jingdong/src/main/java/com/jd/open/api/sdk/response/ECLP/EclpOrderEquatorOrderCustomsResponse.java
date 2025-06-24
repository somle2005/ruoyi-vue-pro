package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.equatorOrderCustoms.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpOrderEquatorOrderCustomsResponse extends AbstractResponse {
   private Result equatorOrderCustomsResult;

   @JsonProperty("equatorOrderCustoms_result")
   public void setEquatorOrderCustomsResult(Result equatorOrderCustomsResult) {
      this.equatorOrderCustomsResult = equatorOrderCustomsResult;
   }

   @JsonProperty("equatorOrderCustoms_result")
   public Result getEquatorOrderCustomsResult() {
      return this.equatorOrderCustomsResult;
   }
}
