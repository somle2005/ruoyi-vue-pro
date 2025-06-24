package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.cancelB2bLwbMain.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCoCancelB2bLwbMainResponse extends AbstractResponse {
   private Result cancelB2bLwbMainResult;

   @JsonProperty("cancelB2bLwbMain_result")
   public void setCancelB2bLwbMainResult(Result cancelB2bLwbMainResult) {
      this.cancelB2bLwbMainResult = cancelB2bLwbMainResult;
   }

   @JsonProperty("cancelB2bLwbMain_result")
   public Result getCancelB2bLwbMainResult() {
      return this.cancelB2bLwbMainResult;
   }
}
