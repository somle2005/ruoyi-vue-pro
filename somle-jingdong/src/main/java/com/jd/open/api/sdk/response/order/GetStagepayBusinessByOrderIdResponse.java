package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.StoreCenterServiceProvider.response.getStagepayBusinessByOrderId.StagepayBusinessTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GetStagepayBusinessByOrderIdResponse extends AbstractResponse {
   private StagepayBusinessTO stagepaybusinessResult;

   @JsonProperty("stagepaybusiness_result")
   public void setStagepaybusinessResult(StagepayBusinessTO stagepaybusinessResult) {
      this.stagepaybusinessResult = stagepaybusinessResult;
   }

   @JsonProperty("stagepaybusiness_result")
   public StagepayBusinessTO getStagepaybusinessResult() {
      return this.stagepaybusinessResult;
   }
}
