package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.OrderWaitingReviewedExportService.response.waitingReviewed.PerformResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class Jd3csOrderCommonWaitingReviewedResponse extends AbstractResponse {
   private PerformResult resultInfo;

   @JsonProperty("resultInfo")
   public void setResultInfo(PerformResult resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public PerformResult getResultInfo() {
      return this.resultInfo;
   }
}
