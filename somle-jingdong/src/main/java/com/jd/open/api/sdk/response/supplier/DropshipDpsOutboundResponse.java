package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsOutboundResponse extends AbstractResponse {
   private OutBoundResultDto outBoundResult;

   @JsonProperty("outBoundResult")
   public void setOutBoundResult(OutBoundResultDto outBoundResult) {
      this.outBoundResult = outBoundResult;
   }

   @JsonProperty("outBoundResult")
   public OutBoundResultDto getOutBoundResult() {
      return this.outBoundResult;
   }
}
