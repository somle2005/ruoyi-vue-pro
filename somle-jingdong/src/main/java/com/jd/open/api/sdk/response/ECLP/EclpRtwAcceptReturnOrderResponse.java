package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.acceptReturnOrder.ReceiptReturnResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpRtwAcceptReturnOrderResponse extends AbstractResponse {
   private ReceiptReturnResult acceptReturnOrderResult;

   @JsonProperty("acceptReturnOrder_result")
   public void setAcceptReturnOrderResult(ReceiptReturnResult acceptReturnOrderResult) {
      this.acceptReturnOrderResult = acceptReturnOrderResult;
   }

   @JsonProperty("acceptReturnOrder_result")
   public ReceiptReturnResult getAcceptReturnOrderResult() {
      return this.acceptReturnOrderResult;
   }
}
