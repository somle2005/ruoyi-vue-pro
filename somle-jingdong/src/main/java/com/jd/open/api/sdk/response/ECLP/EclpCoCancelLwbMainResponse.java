package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.cancelLwbMain.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCoCancelLwbMainResponse extends AbstractResponse {
   private Result cancelLwbMainResult;

   @JsonProperty("cancelLwbMain_result")
   public void setCancelLwbMainResult(Result cancelLwbMainResult) {
      this.cancelLwbMainResult = cancelLwbMainResult;
   }

   @JsonProperty("cancelLwbMain_result")
   public Result getCancelLwbMainResult() {
      return this.cancelLwbMainResult;
   }
}
