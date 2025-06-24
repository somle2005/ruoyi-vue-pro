package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryLwbByCondition.CoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCoQueryLwbByConditionResponse extends AbstractResponse {
   private CoResult coResult;

   @JsonProperty("coResult")
   public void setCoResult(CoResult coResult) {
      this.coResult = coResult;
   }

   @JsonProperty("coResult")
   public CoResult getCoResult() {
      return this.coResult;
   }
}
