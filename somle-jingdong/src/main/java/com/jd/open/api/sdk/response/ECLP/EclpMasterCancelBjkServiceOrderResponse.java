package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.cancelBjkServiceOrder.BjkResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpMasterCancelBjkServiceOrderResponse extends AbstractResponse {
   private BjkResult cancelBjkServiceOrderResult;

   @JsonProperty("cancelBjkServiceOrder_result")
   public void setCancelBjkServiceOrderResult(BjkResult cancelBjkServiceOrderResult) {
      this.cancelBjkServiceOrderResult = cancelBjkServiceOrderResult;
   }

   @JsonProperty("cancelBjkServiceOrder_result")
   public BjkResult getCancelBjkServiceOrderResult() {
      return this.cancelBjkServiceOrderResult;
   }
}
