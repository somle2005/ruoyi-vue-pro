package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.cancelRtwOrder.CancelResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpRtwCancelRtwOrderResponse extends AbstractResponse {
   private CancelResult rtwResult;

   @JsonProperty("rtwResult")
   public void setRtwResult(CancelResult rtwResult) {
      this.rtwResult = rtwResult;
   }

   @JsonProperty("rtwResult")
   public CancelResult getRtwResult() {
      return this.rtwResult;
   }
}
