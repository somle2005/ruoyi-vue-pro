package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsBatchOutBoundResponse extends AbstractResponse {
   private OutBoundResultDto batchOutboundResult;

   @JsonProperty("batchOutboundResult")
   public void setBatchOutboundResult(OutBoundResultDto batchOutboundResult) {
      this.batchOutboundResult = batchOutboundResult;
   }

   @JsonProperty("batchOutboundResult")
   public OutBoundResultDto getBatchOutboundResult() {
      return this.batchOutboundResult;
   }
}
