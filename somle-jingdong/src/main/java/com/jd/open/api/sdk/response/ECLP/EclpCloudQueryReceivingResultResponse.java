package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryReceivingResult.ReceiptResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCloudQueryReceivingResultResponse extends AbstractResponse {
   private ReceiptResult queryreceivingresultResult;

   @JsonProperty("queryreceivingresult_result")
   public void setQueryreceivingresultResult(ReceiptResult queryreceivingresultResult) {
      this.queryreceivingresultResult = queryreceivingresultResult;
   }

   @JsonProperty("queryreceivingresult_result")
   public ReceiptResult getQueryreceivingresultResult() {
      return this.queryreceivingresultResult;
   }
}
