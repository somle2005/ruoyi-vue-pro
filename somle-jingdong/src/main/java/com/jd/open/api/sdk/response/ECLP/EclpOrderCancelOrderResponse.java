package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.cancelOrder.CancelResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpOrderCancelOrderResponse extends AbstractResponse {
   private CancelResult cancelorderResult;

   @JsonProperty("cancelorder_result")
   public void setCancelorderResult(CancelResult cancelorderResult) {
      this.cancelorderResult = cancelorderResult;
   }

   @JsonProperty("cancelorder_result")
   public CancelResult getCancelorderResult() {
      return this.cancelorderResult;
   }
}
