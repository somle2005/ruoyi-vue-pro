package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpIbCancelOutsideMainResponse extends AbstractResponse {
   private boolean canceloutsidemainResult;

   @JsonProperty("canceloutsidemain_result")
   public void setCanceloutsidemainResult(boolean canceloutsidemainResult) {
      this.canceloutsidemainResult = canceloutsidemainResult;
   }

   @JsonProperty("canceloutsidemain_result")
   public boolean getCanceloutsidemainResult() {
      return this.canceloutsidemainResult;
   }
}
